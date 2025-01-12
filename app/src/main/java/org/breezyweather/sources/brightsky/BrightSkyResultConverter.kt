/**
 * This file is part of Breezy Weather.
 *
 * Breezy Weather is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, version 3 of the License.
 *
 * Breezy Weather is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Breezy Weather. If not, see <https://www.gnu.org/licenses/>.
 */

package org.breezyweather.sources.brightsky

import android.graphics.Color
import org.breezyweather.common.basic.models.weather.Alert
import org.breezyweather.common.basic.models.weather.Current
import org.breezyweather.common.basic.models.weather.Daily
import org.breezyweather.common.basic.models.weather.Precipitation
import org.breezyweather.common.basic.models.weather.PrecipitationProbability
import org.breezyweather.common.basic.models.weather.Temperature
import org.breezyweather.common.basic.models.weather.WeatherCode
import org.breezyweather.common.basic.models.weather.Wind
import org.breezyweather.common.basic.wrappers.HourlyWrapper
import org.breezyweather.common.basic.wrappers.SecondaryWeatherWrapper
import org.breezyweather.common.basic.wrappers.WeatherWrapper
import org.breezyweather.common.exceptions.WeatherException
import org.breezyweather.common.extensions.getFormattedDate
import org.breezyweather.common.extensions.toDateNoHour
import org.breezyweather.sources.brightsky.json.BrightSkyAlert
import org.breezyweather.sources.brightsky.json.BrightSkyAlertsResult
import org.breezyweather.sources.brightsky.json.BrightSkyCurrentWeather
import org.breezyweather.sources.brightsky.json.BrightSkyCurrentWeatherResult
import org.breezyweather.sources.brightsky.json.BrightSkyWeather
import org.breezyweather.sources.brightsky.json.BrightSkyWeatherResult
import java.util.Locale
import java.util.TimeZone


/**
 * Converts PirateWeather result into a forecast
 */
fun convert(
    weatherResult: BrightSkyWeatherResult,
    currentWeatherResult: BrightSkyCurrentWeatherResult,
    alertsResult: BrightSkyAlertsResult,
    timeZone: TimeZone,
    languageCode: String
): WeatherWrapper {
    // If the API doesn’t return weather, consider data as garbage and keep cached data
    if (weatherResult.weather.isNullOrEmpty()) {
        throw WeatherException()
    }

    return WeatherWrapper(
        current = getCurrent(currentWeatherResult.weather),
        dailyForecast = getDailyForecast(timeZone, weatherResult.weather),
        hourlyForecast = getHourlyForecast(weatherResult.weather),
        alertList = getAlertList(alertsResult.alerts, languageCode)
    )
}

/**
 * Returns current weather
 */
private fun getCurrent(result: BrightSkyCurrentWeather?): Current? {
    if (result == null) return null
    return Current(
        weatherCode = getWeatherCode(result.icon),
        temperature = Temperature(
            temperature = result.temperature
        ),
        wind = Wind(
            degree = result.windDirection?.toFloat(),
            speed = result.windSpeed?.div(3.6f),
            gusts = result.windGustSpeed?.div(3.6f)
        ),
        relativeHumidity = result.relativeHumidity?.toFloat(),
        dewPoint = result.dewPoint,
        pressure = result.pressure,
        cloudCover = result.cloudCover,
        visibility = result.visibility?.toFloat()
    )
}

/**
 * Generate empty daily days from hourly weather since daily doesn't exist in API
 */
private fun getDailyForecast(
    timeZone: TimeZone,
    weatherResult: List<BrightSkyWeather>
): List<Daily> {
    val dailyList: MutableList<Daily> = ArrayList()
    val hourlyListByDay = weatherResult.groupBy { it.timestamp.getFormattedDate(timeZone, "yyyy-MM-dd", Locale.ENGLISH) }
    for (i in 0 until hourlyListByDay.entries.size - 1) {
        val dayDate = hourlyListByDay.keys.toTypedArray()[i].toDateNoHour(timeZone)
        if (dayDate != null) {
            dailyList.add(
                Daily(
                    date = dayDate
                )
            )
        }
    }
    return dailyList
}

/**
 * Returns hourly forecast
 */
private fun getHourlyForecast(
    weatherResult: List<BrightSkyWeather>
): List<HourlyWrapper> {
    return weatherResult.map { result ->
        HourlyWrapper(
            date = result.timestamp,
            weatherCode = getWeatherCode(result.icon),
            temperature = Temperature(
                temperature = result.temperature
            ),
            precipitation = Precipitation(
                total = result.precipitation
            ),
            precipitationProbability = PrecipitationProbability(
                total = result.precipitationProbability?.toFloat()
            ),
            wind = Wind(
                degree = result.windDirection?.toFloat(),
                speed = result.windSpeed?.div(3.6f),
                gusts = result.windGustSpeed?.div(3.6f)
            ),
            relativeHumidity = result.relativeHumidity?.toFloat(),
            dewPoint = result.dewPoint,
            pressure = result.pressure,
            cloudCover = result.cloudCover,
            visibility = result.visibility?.toFloat()
        )
    }
}

/**
 * Returns alerts
 */
private fun getAlertList(alertList: List<BrightSkyAlert>?, languageCode: String): List<Alert>? {
    if (alertList.isNullOrEmpty()) return null
    return alertList.map { alert ->
        Alert(
            alertId = alert.id.toString(),
            startDate = alert.onset,
            endDate = alert.expires,
            description = if (languageCode == "de") {
                alert.headlineDe ?: "Warnung"
            } else alert.headlineEn ?: "Alert",
            content = if (languageCode == "de") {
                if (!alert.instructionDe.isNullOrEmpty()) {
                    alert.descriptionDe + "\n\n" + alert.instructionDe
                } else alert.descriptionDe
            } else {
                if (!alert.instructionEn.isNullOrEmpty()) {
                    alert.descriptionEn + "\n\n" + alert.instructionEn
                } else alert.descriptionEn
            },
            priority = when (alert.severity?.lowercase()) {
                "extreme" -> 1
                "severe" -> 2
                "moderate" -> 3
                "minor" -> 4
                else -> 5
            },
            color = when (alert.severity?.lowercase()) {
                "extreme" -> Color.rgb(241, 48, 255)
                "severe" -> Color.rgb(255, 48, 48)
                "moderate" -> Color.rgb(255, 179, 48)
                "minor" -> Color.rgb(255, 238, 48)
                else -> null
            }
        )
    }
}

private fun getWeatherCode(icon: String?): WeatherCode? {
    return when (icon) {
        "clear-day", "clear-night" -> WeatherCode.CLEAR
        "partly-cloudy-day", "partly-cloudy-night" -> WeatherCode.PARTLY_CLOUDY
        "cloudy" -> WeatherCode.CLOUDY
        "fog" -> WeatherCode.FOG
        "wind" -> WeatherCode.WIND
        "rain" -> WeatherCode.RAIN
        "sleet" -> WeatherCode.SLEET
        "snow" -> WeatherCode.SNOW
        "hail" -> WeatherCode.HAIL
        "thunderstorm" -> WeatherCode.THUNDERSTORM
        else -> null
    }
}

fun convertSecondary(
    alertsResult: BrightSkyAlertsResult,
    languageCode: String
): SecondaryWeatherWrapper {

    return SecondaryWeatherWrapper(
        alertList = getAlertList(alertsResult.alerts, languageCode)
    )
}
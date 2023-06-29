package org.breezyweather.weather.metno.json

import kotlinx.serialization.Serializable

@Serializable
data class MetNoEphemerisMoonPosition(
    val phase: Float?,
    val desc: String?
)
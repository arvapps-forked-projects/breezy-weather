package wangdaye.com.geometricweather.data.entity.result.accu;

import java.util.List;

public class AccuMinuteResult {

    /**
     * Summary : {"Phrase":"至少 120 分钟内无降水","Phrase_60":"至少 60 分钟内无降水","WidgetPhrase":"查看 MinuteCast®","ShortPhrase":"在 120 分钟内无降水","BriefPhrase":"至少 120 分钟内无降水","LongPhrase":"至少 120 分钟内无降水","IconCode":7}
     * Summaries : [{"StartMinute":0,"EndMinute":119,"CountMinute":120,"MinuteText":"至少 %MINUTE_VALUE 分钟内无降水","MinutesText":"至少 %MINUTE_VALUE 分钟内无降水","WidgetPhrase":"查看 MinuteCast®","ShortPhrase":"在 %MINUTE_VALUE 分钟内无降水","BriefPhrase":"至少 %MINUTE_VALUE 分钟内无降水","LongPhrase":"至少 %MINUTE_VALUE 分钟内无降水","IconCode":7}]
     * Intervals : [{"StartDateTime":"2019-01-11T21:39:00+08:00","StartEpochDateTime":1547213940000,"Minute":0,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:40:00+08:00","StartEpochDateTime":1547214000000,"Minute":1,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:41:00+08:00","StartEpochDateTime":1547214060000,"Minute":2,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:42:00+08:00","StartEpochDateTime":1547214120000,"Minute":3,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:43:00+08:00","StartEpochDateTime":1547214180000,"Minute":4,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:44:00+08:00","StartEpochDateTime":1547214240000,"Minute":5,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:45:00+08:00","StartEpochDateTime":1547214300000,"Minute":6,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:46:00+08:00","StartEpochDateTime":1547214360000,"Minute":7,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:47:00+08:00","StartEpochDateTime":1547214420000,"Minute":8,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:48:00+08:00","StartEpochDateTime":1547214480000,"Minute":9,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:49:00+08:00","StartEpochDateTime":1547214540000,"Minute":10,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:50:00+08:00","StartEpochDateTime":1547214600000,"Minute":11,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:51:00+08:00","StartEpochDateTime":1547214660000,"Minute":12,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:52:00+08:00","StartEpochDateTime":1547214720000,"Minute":13,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:53:00+08:00","StartEpochDateTime":1547214780000,"Minute":14,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:54:00+08:00","StartEpochDateTime":1547214840000,"Minute":15,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:55:00+08:00","StartEpochDateTime":1547214900000,"Minute":16,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:56:00+08:00","StartEpochDateTime":1547214960000,"Minute":17,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:57:00+08:00","StartEpochDateTime":1547215020000,"Minute":18,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:58:00+08:00","StartEpochDateTime":1547215080000,"Minute":19,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T21:59:00+08:00","StartEpochDateTime":1547215140000,"Minute":20,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T22:00:00+08:00","StartEpochDateTime":1547215200000,"Minute":21,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T22:01:00+08:00","StartEpochDateTime":1547215260000,"Minute":22,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T22:02:00+08:00","StartEpochDateTime":1547215320000,"Minute":23,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T22:03:00+08:00","StartEpochDateTime":1547215380000,"Minute":24,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T22:04:00+08:00","StartEpochDateTime":1547215440000,"Minute":25,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T22:05:00+08:00","StartEpochDateTime":1547215500000,"Minute":26,"Dbz":0,"ShortPhrase":"无降水","IconCode":11,"CloudCover":100},{"StartDateTime":"2019-01-11T22:06:00+08:00","StartEpochDateTime":1547215560000,"Minute":27,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:07:00+08:00","StartEpochDateTime":1547215620000,"Minute":28,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:08:00+08:00","StartEpochDateTime":1547215680000,"Minute":29,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:09:00+08:00","StartEpochDateTime":1547215740000,"Minute":30,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:10:00+08:00","StartEpochDateTime":1547215800000,"Minute":31,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:11:00+08:00","StartEpochDateTime":1547215860000,"Minute":32,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:12:00+08:00","StartEpochDateTime":1547215920000,"Minute":33,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:13:00+08:00","StartEpochDateTime":1547215980000,"Minute":34,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:14:00+08:00","StartEpochDateTime":1547216040000,"Minute":35,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:15:00+08:00","StartEpochDateTime":1547216100000,"Minute":36,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:16:00+08:00","StartEpochDateTime":1547216160000,"Minute":37,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:17:00+08:00","StartEpochDateTime":1547216220000,"Minute":38,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:18:00+08:00","StartEpochDateTime":1547216280000,"Minute":39,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:19:00+08:00","StartEpochDateTime":1547216340000,"Minute":40,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:20:00+08:00","StartEpochDateTime":1547216400000,"Minute":41,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:21:00+08:00","StartEpochDateTime":1547216460000,"Minute":42,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:22:00+08:00","StartEpochDateTime":1547216520000,"Minute":43,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:23:00+08:00","StartEpochDateTime":1547216580000,"Minute":44,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:24:00+08:00","StartEpochDateTime":1547216640000,"Minute":45,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:25:00+08:00","StartEpochDateTime":1547216700000,"Minute":46,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:26:00+08:00","StartEpochDateTime":1547216760000,"Minute":47,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:27:00+08:00","StartEpochDateTime":1547216820000,"Minute":48,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:28:00+08:00","StartEpochDateTime":1547216880000,"Minute":49,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:29:00+08:00","StartEpochDateTime":1547216940000,"Minute":50,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:30:00+08:00","StartEpochDateTime":1547217000000,"Minute":51,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:31:00+08:00","StartEpochDateTime":1547217060000,"Minute":52,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:32:00+08:00","StartEpochDateTime":1547217120000,"Minute":53,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:33:00+08:00","StartEpochDateTime":1547217180000,"Minute":54,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:34:00+08:00","StartEpochDateTime":1547217240000,"Minute":55,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:35:00+08:00","StartEpochDateTime":1547217300000,"Minute":56,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:36:00+08:00","StartEpochDateTime":1547217360000,"Minute":57,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:37:00+08:00","StartEpochDateTime":1547217420000,"Minute":58,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:38:00+08:00","StartEpochDateTime":1547217480000,"Minute":59,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:39:00+08:00","StartEpochDateTime":1547217540000,"Minute":60,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:40:00+08:00","StartEpochDateTime":1547217600000,"Minute":61,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:41:00+08:00","StartEpochDateTime":1547217660000,"Minute":62,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":100},{"StartDateTime":"2019-01-11T22:42:00+08:00","StartEpochDateTime":1547217720000,"Minute":63,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":99},{"StartDateTime":"2019-01-11T22:43:00+08:00","StartEpochDateTime":1547217780000,"Minute":64,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":99},{"StartDateTime":"2019-01-11T22:44:00+08:00","StartEpochDateTime":1547217840000,"Minute":65,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":99},{"StartDateTime":"2019-01-11T22:45:00+08:00","StartEpochDateTime":1547217900000,"Minute":66,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":98},{"StartDateTime":"2019-01-11T22:46:00+08:00","StartEpochDateTime":1547217960000,"Minute":67,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":98},{"StartDateTime":"2019-01-11T22:47:00+08:00","StartEpochDateTime":1547218020000,"Minute":68,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":98},{"StartDateTime":"2019-01-11T22:48:00+08:00","StartEpochDateTime":1547218080000,"Minute":69,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":97},{"StartDateTime":"2019-01-11T22:49:00+08:00","StartEpochDateTime":1547218140000,"Minute":70,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":97},{"StartDateTime":"2019-01-11T22:50:00+08:00","StartEpochDateTime":1547218200000,"Minute":71,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":97},{"StartDateTime":"2019-01-11T22:51:00+08:00","StartEpochDateTime":1547218260000,"Minute":72,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":96},{"StartDateTime":"2019-01-11T22:52:00+08:00","StartEpochDateTime":1547218320000,"Minute":73,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":95},{"StartDateTime":"2019-01-11T22:53:00+08:00","StartEpochDateTime":1547218380000,"Minute":74,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":94},{"StartDateTime":"2019-01-11T22:54:00+08:00","StartEpochDateTime":1547218440000,"Minute":75,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":93},{"StartDateTime":"2019-01-11T22:55:00+08:00","StartEpochDateTime":1547218500000,"Minute":76,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":92},{"StartDateTime":"2019-01-11T22:56:00+08:00","StartEpochDateTime":1547218560000,"Minute":77,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":91},{"StartDateTime":"2019-01-11T22:57:00+08:00","StartEpochDateTime":1547218620000,"Minute":78,"Dbz":0,"ShortPhrase":"无降水","IconCode":7,"CloudCover":90},{"StartDateTime":"2019-01-11T22:58:00+08:00","StartEpochDateTime":1547218680000,"Minute":79,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":89},{"StartDateTime":"2019-01-11T22:59:00+08:00","StartEpochDateTime":1547218740000,"Minute":80,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":88},{"StartDateTime":"2019-01-11T23:00:00+08:00","StartEpochDateTime":1547218800000,"Minute":81,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":88},{"StartDateTime":"2019-01-11T23:01:00+08:00","StartEpochDateTime":1547218860000,"Minute":82,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":87},{"StartDateTime":"2019-01-11T23:02:00+08:00","StartEpochDateTime":1547218920000,"Minute":83,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":87},{"StartDateTime":"2019-01-11T23:03:00+08:00","StartEpochDateTime":1547218980000,"Minute":84,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":86},{"StartDateTime":"2019-01-11T23:04:00+08:00","StartEpochDateTime":1547219040000,"Minute":85,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":86},{"StartDateTime":"2019-01-11T23:05:00+08:00","StartEpochDateTime":1547219100000,"Minute":86,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":85},{"StartDateTime":"2019-01-11T23:06:00+08:00","StartEpochDateTime":1547219160000,"Minute":87,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":85},{"StartDateTime":"2019-01-11T23:07:00+08:00","StartEpochDateTime":1547219220000,"Minute":88,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":84},{"StartDateTime":"2019-01-11T23:08:00+08:00","StartEpochDateTime":1547219280000,"Minute":89,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":84},{"StartDateTime":"2019-01-11T23:09:00+08:00","StartEpochDateTime":1547219340000,"Minute":90,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":83},{"StartDateTime":"2019-01-11T23:10:00+08:00","StartEpochDateTime":1547219400000,"Minute":91,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":83},{"StartDateTime":"2019-01-11T23:11:00+08:00","StartEpochDateTime":1547219460000,"Minute":92,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":81},{"StartDateTime":"2019-01-11T23:12:00+08:00","StartEpochDateTime":1547219520000,"Minute":93,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":80},{"StartDateTime":"2019-01-11T23:13:00+08:00","StartEpochDateTime":1547219580000,"Minute":94,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":78},{"StartDateTime":"2019-01-11T23:14:00+08:00","StartEpochDateTime":1547219640000,"Minute":95,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":77},{"StartDateTime":"2019-01-11T23:15:00+08:00","StartEpochDateTime":1547219700000,"Minute":96,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":76},{"StartDateTime":"2019-01-11T23:16:00+08:00","StartEpochDateTime":1547219760000,"Minute":97,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":74},{"StartDateTime":"2019-01-11T23:17:00+08:00","StartEpochDateTime":1547219820000,"Minute":98,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":73},{"StartDateTime":"2019-01-11T23:18:00+08:00","StartEpochDateTime":1547219880000,"Minute":99,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":71},{"StartDateTime":"2019-01-11T23:19:00+08:00","StartEpochDateTime":1547219940000,"Minute":100,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":70},{"StartDateTime":"2019-01-11T23:20:00+08:00","StartEpochDateTime":1547220000000,"Minute":101,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":69},{"StartDateTime":"2019-01-11T23:21:00+08:00","StartEpochDateTime":1547220060000,"Minute":102,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":67},{"StartDateTime":"2019-01-11T23:22:00+08:00","StartEpochDateTime":1547220120000,"Minute":103,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":66},{"StartDateTime":"2019-01-11T23:23:00+08:00","StartEpochDateTime":1547220180000,"Minute":104,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":64},{"StartDateTime":"2019-01-11T23:24:00+08:00","StartEpochDateTime":1547220240000,"Minute":105,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":63},{"StartDateTime":"2019-01-11T23:25:00+08:00","StartEpochDateTime":1547220300000,"Minute":106,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":62},{"StartDateTime":"2019-01-11T23:26:00+08:00","StartEpochDateTime":1547220360000,"Minute":107,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":60},{"StartDateTime":"2019-01-11T23:27:00+08:00","StartEpochDateTime":1547220420000,"Minute":108,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":59},{"StartDateTime":"2019-01-11T23:28:00+08:00","StartEpochDateTime":1547220480000,"Minute":109,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":58},{"StartDateTime":"2019-01-11T23:29:00+08:00","StartEpochDateTime":1547220540000,"Minute":110,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":56},{"StartDateTime":"2019-01-11T23:30:00+08:00","StartEpochDateTime":1547220600000,"Minute":111,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":55},{"StartDateTime":"2019-01-11T23:31:00+08:00","StartEpochDateTime":1547220660000,"Minute":112,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":55},{"StartDateTime":"2019-01-11T23:32:00+08:00","StartEpochDateTime":1547220720000,"Minute":113,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":54},{"StartDateTime":"2019-01-11T23:33:00+08:00","StartEpochDateTime":1547220780000,"Minute":114,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":54},{"StartDateTime":"2019-01-11T23:34:00+08:00","StartEpochDateTime":1547220840000,"Minute":115,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":54},{"StartDateTime":"2019-01-11T23:35:00+08:00","StartEpochDateTime":1547220900000,"Minute":116,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":53},{"StartDateTime":"2019-01-11T23:36:00+08:00","StartEpochDateTime":1547220960000,"Minute":117,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":53},{"StartDateTime":"2019-01-11T23:37:00+08:00","StartEpochDateTime":1547221020000,"Minute":118,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":53},{"StartDateTime":"2019-01-11T23:38:00+08:00","StartEpochDateTime":1547221080000,"Minute":119,"Dbz":0,"ShortPhrase":"无降水","IconCode":38,"CloudCover":52}]
     * MobileLink : http://m.accuweather.com/zh/cn/licang-district/2333323/minute-weather-forecast/2333323?lang=zh-cn?lat=36.14&lon=120.42
     * Link : http://www.accuweather.com/zh/cn/licang-district/2333323/minute-weather-forecast/2333323?lang=zh-cn?lat=36.14&lon=120.42
     */

    private SummaryBean Summary;
    private String MobileLink;
    private String Link;
    private List<SummariesBean> Summaries;
    private List<IntervalsBean> Intervals;

    public SummaryBean getSummary() {
        return Summary;
    }

    public void setSummary(SummaryBean Summary) {
        this.Summary = Summary;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public List<SummariesBean> getSummaries() {
        return Summaries;
    }

    public void setSummaries(List<SummariesBean> Summaries) {
        this.Summaries = Summaries;
    }

    public List<IntervalsBean> getIntervals() {
        return Intervals;
    }

    public void setIntervals(List<IntervalsBean> Intervals) {
        this.Intervals = Intervals;
    }

    public static class SummaryBean {
        /**
         * Phrase : 至少 120 分钟内无降水
         * Phrase_60 : 至少 60 分钟内无降水
         * WidgetPhrase : 查看 MinuteCast®
         * ShortPhrase : 在 120 分钟内无降水
         * BriefPhrase : 至少 120 分钟内无降水
         * LongPhrase : 至少 120 分钟内无降水
         * IconCode : 7
         */

        private String Phrase;
        private String Phrase_60;
        private String WidgetPhrase;
        private String ShortPhrase;
        private String BriefPhrase;
        private String LongPhrase;
        private int IconCode;

        public String getPhrase() {
            return Phrase;
        }

        public void setPhrase(String Phrase) {
            this.Phrase = Phrase;
        }

        public String getPhrase_60() {
            return Phrase_60;
        }

        public void setPhrase_60(String Phrase_60) {
            this.Phrase_60 = Phrase_60;
        }

        public String getWidgetPhrase() {
            return WidgetPhrase;
        }

        public void setWidgetPhrase(String WidgetPhrase) {
            this.WidgetPhrase = WidgetPhrase;
        }

        public String getShortPhrase() {
            return ShortPhrase;
        }

        public void setShortPhrase(String ShortPhrase) {
            this.ShortPhrase = ShortPhrase;
        }

        public String getBriefPhrase() {
            return BriefPhrase;
        }

        public void setBriefPhrase(String BriefPhrase) {
            this.BriefPhrase = BriefPhrase;
        }

        public String getLongPhrase() {
            return LongPhrase;
        }

        public void setLongPhrase(String LongPhrase) {
            this.LongPhrase = LongPhrase;
        }

        public int getIconCode() {
            return IconCode;
        }

        public void setIconCode(int IconCode) {
            this.IconCode = IconCode;
        }
    }

    public static class SummariesBean {
        /**
         * StartMinute : 0
         * EndMinute : 119
         * CountMinute : 120
         * MinuteText : 至少 %MINUTE_VALUE 分钟内无降水
         * MinutesText : 至少 %MINUTE_VALUE 分钟内无降水
         * WidgetPhrase : 查看 MinuteCast®
         * ShortPhrase : 在 %MINUTE_VALUE 分钟内无降水
         * BriefPhrase : 至少 %MINUTE_VALUE 分钟内无降水
         * LongPhrase : 至少 %MINUTE_VALUE 分钟内无降水
         * IconCode : 7
         */

        private int StartMinute;
        private int EndMinute;
        private int CountMinute;
        private String MinuteText;
        private String MinutesText;
        private String WidgetPhrase;
        private String ShortPhrase;
        private String BriefPhrase;
        private String LongPhrase;
        private int IconCode;

        public int getStartMinute() {
            return StartMinute;
        }

        public void setStartMinute(int StartMinute) {
            this.StartMinute = StartMinute;
        }

        public int getEndMinute() {
            return EndMinute;
        }

        public void setEndMinute(int EndMinute) {
            this.EndMinute = EndMinute;
        }

        public int getCountMinute() {
            return CountMinute;
        }

        public void setCountMinute(int CountMinute) {
            this.CountMinute = CountMinute;
        }

        public String getMinuteText() {
            return MinuteText;
        }

        public void setMinuteText(String MinuteText) {
            this.MinuteText = MinuteText;
        }

        public String getMinutesText() {
            return MinutesText;
        }

        public void setMinutesText(String MinutesText) {
            this.MinutesText = MinutesText;
        }

        public String getWidgetPhrase() {
            return WidgetPhrase;
        }

        public void setWidgetPhrase(String WidgetPhrase) {
            this.WidgetPhrase = WidgetPhrase;
        }

        public String getShortPhrase() {
            return ShortPhrase;
        }

        public void setShortPhrase(String ShortPhrase) {
            this.ShortPhrase = ShortPhrase;
        }

        public String getBriefPhrase() {
            return BriefPhrase;
        }

        public void setBriefPhrase(String BriefPhrase) {
            this.BriefPhrase = BriefPhrase;
        }

        public String getLongPhrase() {
            return LongPhrase;
        }

        public void setLongPhrase(String LongPhrase) {
            this.LongPhrase = LongPhrase;
        }

        public int getIconCode() {
            return IconCode;
        }

        public void setIconCode(int IconCode) {
            this.IconCode = IconCode;
        }
    }

    public static class IntervalsBean {
        /**
         * StartDateTime : 2019-01-11T21:39:00+08:00
         * StartEpochDateTime : 1547213940000
         * Minute : 0
         * Dbz : 0.0
         * ShortPhrase : 无降水
         * IconCode : 11
         * CloudCover : 100
         */

        private String StartDateTime;
        private long StartEpochDateTime;
        private int Minute;
        private double Dbz;
        private String ShortPhrase;
        private int IconCode;
        private int CloudCover;

        public String getStartDateTime() {
            return StartDateTime;
        }

        public void setStartDateTime(String StartDateTime) {
            this.StartDateTime = StartDateTime;
        }

        public long getStartEpochDateTime() {
            return StartEpochDateTime;
        }

        public void setStartEpochDateTime(long StartEpochDateTime) {
            this.StartEpochDateTime = StartEpochDateTime;
        }

        public int getMinute() {
            return Minute;
        }

        public void setMinute(int Minute) {
            this.Minute = Minute;
        }

        public double getDbz() {
            return Dbz;
        }

        public void setDbz(double Dbz) {
            this.Dbz = Dbz;
        }

        public String getShortPhrase() {
            return ShortPhrase;
        }

        public void setShortPhrase(String ShortPhrase) {
            this.ShortPhrase = ShortPhrase;
        }

        public int getIconCode() {
            return IconCode;
        }

        public void setIconCode(int IconCode) {
            this.IconCode = IconCode;
        }

        public int getCloudCover() {
            return CloudCover;
        }

        public void setCloudCover(int CloudCover) {
            this.CloudCover = CloudCover;
        }
    }
}
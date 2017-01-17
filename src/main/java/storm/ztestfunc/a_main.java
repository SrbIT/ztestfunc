/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.io.IOException;
import java.util.HashMap;
import static storm.ztestfunc.check_api.APICM;

/**
 *
 *
 * @author soh-l
 */
public class a_main {

    public static void main(String[] args) throws IOException {

//        System.out.println(checkMovieName.checkMV("The Monkey King 2"));
//
//        int a = 45;
//        if (a < 15) {
//            System.out.println("15");
//        } else if (a < 30) {
//            System.out.println("30");
//        } else if (a < 60) {
//            System.out.println("m30");
//        } else if (a > 60) {
//            System.out.println("60");
//        }
//        String a = "python-requests/2.8.1";
//
//        if (a.contains("python-requests")) {
//            System.out.println("python-requests/2.8.1");
//        } else {
//            System.out.println("z");
//        }
//
//        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
//        Date now = new Date();
//        String strDate = sdfDate.format(now);
//        System.out.println(strDate);
//        System.out.println("a"+);
//
//        String service = "pay";
//        String token = "0000361b-c8b8-4074-a3d7-5413fabdaad0";
//        String service = "cas";
//        String token = "00040d04-211c-4e59-9283-25ed57111c10";
//        String service = "cm";
//        String token = "5e1ff46c-6c55-46bb-9044-81ccef422ed4";
//        String service = "bill";
//        String token = "0000377a-5c37-4a61-a4d9-658f8979ef6f";
//        
//        HashMap a = API_DB(service, token);
//        System.out.println("aaaaaaaaaa" + a.get(1));
////        String IPv4="192.168.1.103";
//        String IPv4="118.69.169.192";
//        CheckIP(IPv4);
//        String agent = "python-requests/2.8.1";
//        String agent = "Mozilla/5.0 (Linux; U; Android 4.1.1; nl-nl; POV_TV-HDMI-200BT Build/JRO03H) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30";
//        String agent = "Mozilla/5.0 (QtEmbedded; U; Linux; C) AppleWebKit/533.3 (KHTML, like Gecko) SigmaDesigns/0.5 Safari/533.3 Standalone";
//        String agent ="Mozilla/5.0 (CrKey armv7l 1.4.15250) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.0 Safari/537.36";
//        String agent = "HbbTV/1.1.1 (;Samsung;SmartTV2013;T-FXPDEUC-1102.2;;) WebKit";
//        String agent = "HbbTV/1.1.1 (;Samsung;SmartTV2013;T-FXPDEUC-1102.2;;) WebKit";
// String agent="Mozilla/5.0 (SmartHub; SMART-TV; U; Linux/SmartTV) AppleWebKit/531.2+ (KHTML, like Gecko) WebBrowser/1.0 SmartTV Safari/531.2+";
//        String agent = "Mozilla/5.0 (SMART-TV; X11; Linux i686) AppleWebKit/535.20+ (KHTML, like Gecko) Version/5.0 Safari/535.20+";
//        String agent = "Mozilla/5.0 (SmartHub; SMART-TV; U; Linux/SmartTV; Maple2012)";
//        String agent = "Mozilla/5.0 (SmartHub; SMART-TV; U; Linux/SmartTV; Maple2012) AppleWebKit/534.7 (KHTML, like Gecko) SmartTV Safari/534.7";
//        String agent = "Mozilla/4.0 (compatible; Gecko/20041115) Maple 5.0.0 Navi";
//        String agent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.94 Safari/537.36";
//        String agent ="Opera/9.80 (Linux armv7l; InettvBrowser/2.2 (00014A;SonyDTV115;0002;0100) KDL42W650A; CC/GRC) Presto/2.12.362 Version/12.11";
//        String agent = "Opera/9.80 (Linux armv6l; Opera TV Store/5599; (SonyBDP/BDV13)) Presto/2.12.362 Version/12.11";
//String agent ="Mozilla/5.0 (DirectFB; U; Linux 35230; en) AppleWebKit/531.2+ (KHTML, like Gecko) Safari/531.2+ LG Browser/4.1.4(+3D+SCREEN+TUNER; LGE; 42LW5700-SA; 04.02.28; 0x00000001;); LG NetCast.TV-2011";
//        String agent = "Mozilla/5.0 (DirectFB; U; Linux mips; en) AppleWebKit/531.2+ (KHTML, like Gecko) Safari/531.2+ LG Browser/4.0.10(+SCREEN+TUNER; LGE; 42LE5500-SA; 04.02.02; 0x00000001;); LG NetCast.TV-2010";
//        String agent = "Mozilla/5.0 (Unknown; Linux armv7l) AppleWebKit/537.1+ (KHTML, like Gecko) Safari/537.1+ LG Browser/6.00.00(+mouse+3D+SCREEN+TUNER; LGE; GLOBAL-PLAT5; 03.07.01; 0x00000001;); LG NetCast.TV-2013/03.17.01 (LG, GLOBAL-PLAT4, wired)";
//String agent ="Mozilla/5.0 (DirectFB; Linux armv7l) AppleWebKit/534.26+ (KHTML, like Gecko) Version/5.0 Safari/534.26+ HbbTV/1.1.1 ( ;LGE ;NetCast 3.0 ;1.0 ;1.0M ;)";
//String agent="Mozilla/5.0 (SMART-TV; Linux; Tizen 2.3) AppleWebkit/538.1 (KHTML, like Gecko) SamsungBrowser/1.0 TV Safari/538.1";
//String agent="Mozilla/5.0 (SMART-TV; X11; Linux armv7l) AppleWebkit/537.42 (KHTML, like Gecko) Safari/537.42";
//String agent="Mozilla/5.0 (SMART-TV;X11; Linux i686) AppleWebkit/535.20+ (KHTML, like Gecko) Version/5.0 Safari/535.20+";
//String agent="Mozilla/5.0 (SMART-TV; X11; Linux i686) AppleWebKit/534.7 (KHTML, like Gecko) Version/5.0 Safari/534.7";
//String agent="Mozilla/5.0 (SmartHub; SMART-TV; U; Linux/SmartTV) AppleWebKit/531.2 (KHTML, like Gecko) Web Browser/1.0 SmartTV Safari/531.2+";
//        String agent = "Mozilla/5.0 (Linux; U; Android 2.2.1; en-ca; LG-P505R Build/FRG83) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1";
//        String agent = "Mozilla/5.0 (Web0S; Linux/SmartTV) AppleWebKit/537.36 (KHTML, like Gecko) QtWebEngine/5.2.1 Chrome/38.0.2125.122 Safari/537.36 WebAppManager";
//        String agent = "Mozilla/5.0 (Web0S; Linux/SmartTV) AppleWebKit/538.2 (KHTML, like Gecko) Large Screen WebAppManager Safari/538.2";
//        String agent = "Mozilla/5.0 (Web0S; Linux/SmartTV) AppleWebKit/537.41 (KHTML, like Gecko) Large Screen WebAppManager Safari/537.41";
//        String agent = "Mozilla/5.0 (Linux; U; Android 4.2.2; en-us; AFTB Build/JDQ39) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";
////
//        HashMap<Integer, String> hashMapGetAgent = HashMapAgent(agent);
////
//        String agentType = hashMapGetAgent.get(1);
//        String agentDevice = hashMapGetAgent.get(2);
//        String agentOS = hashMapGetAgent.get(3);
//////
//        System.out.println(agentType + " " + agentDevice + " " + agentOS);
////        UASparser parser = new UASparser();
////        UserAgentInfo info = parser.parse("Mozilla/4.0 (compatible; MSIE 7.0;Windows NT 5.1; )");
////        System.out.println(info.getType());
//        UASparser parser = new UASparser(OnlineUpdater.getVendoredInputStream());
////        UserAgentInfo info = parser.parse("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.82 Safari/537.36");
////        UserAgentInfo info = parser.parse("Mozilla/5.0 (Linux; U; Android 4.1.1; nl-nl; POV_TV-HDMI-200BT Build/JRO03H) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30");
//        UserAgentInfo info = parser.parse(agent);
//        System.out.println(info.getDeviceType());
//        System.out.println(info.getOsName());
//        System.out.println(info.getUaName());
//        System.out.println(info.);
//
//        String request = "/af21988a-1da4-45fc-a158-fca65d56aaa9/ark-d59/4/0b78f655f7d16b37c72b6081b3033d59/smooth_wdvn/mobile-video=1835288-589.m4s";
//        if (request.contains("dash_")) {
//            System.out.println("dash_");
//        } else if (request.contains("hls_")) {
//            System.out.println("hls_");
//        } else if (request.contains("smooth_")) {
//            System.out.println("smooth_");
//        }
//
//        String request = "/dbc289c90d90a0478c486bd042b070ee/ark-0ee/6/dbc289c90d90a0478c486bd042b070ee/smooth_plrd.ism/QualityLevels(6514000)/Fragments(video=1371371372)";
//        String request1 = "/ark-0ee/6/dbc289c90d90a0478c486bd042b070ee/smooth_plrd.ism/QualityLevels(6514000)/Fragments(video=1371371372)";
//        String vhost = "c01-fcdn.fimplus.io";
////        if (!obj.vhost.contains("fcdn")) {
//        if (!vhost.contains("fcdn")) {
//            System.out.println("not f");
//
//        } else {
//            System.out.println(vhost);
////            check(request);
//            check(request1);
//        }
//        int a[] = new int[6];
//        a[0] = 10;
//        a[1] = 12;
//        a[2] = 48;
//        a[3] = 17;
//        a[4] = 5;
//        a[5] = 49;
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hang YamaHa: " + i);
//        }
//        int i = 0;
//        boolean abc = true;
//        while (abc) {
//            System.out.println("Hang YamaHa: ");
//            if (1 > 0) {
//                abc = false;
//            }
////            i++;
//        }
//        int i = 10;
//        do {
//            System.out.println("Hang YamaHa: " + i--);
//        } while (true);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        String time = "14/Feb/2016:00:00:15";
//        String time = "Z18/Feb/2016:01:01:15 +0700";
//        String time = "18/Feb/2016:08:01:15 +0700";
//        String time = "18/Feb/2016:11:17:11 +0700";
////        String time2 = "2016-02-18T15:12:20.582+0700";
//        String time2 = "2016-02-24T03:29:08.731Z";
//
//        Date dateLog = null;
//        dateLog = new Date(2016 - 1900, 4 - 1, 18, 15, 12, 20);
//        System.out.println(dateLog);
//        String time = "2016-02-17T01:08:05.153";
//        time_utc(time);
//        System.out.println("Main: " + time_nginx4(time, time2));
//        System.out.println("Nhap 3 so: ");
//        String a="a\"\" s";
//        System.out.println(fNotNull(a));
//        String a="5";
//        System.out.println(a.length());
//        
//        
//        String tmp="/08269623-ea69-4fbf-ab71-b127c89f849f/3/ce7874dc9538c5b835647368dbc0da64/web.ism/dash/web-video=6456000-1177600.dash";
//
//        if(tmp.contains("dash/")){
//            System.out.println("dash");
//        }else{
//            System.out.println("no_dash");
//        }
        String accessToken = "ajmldccfpln2016";
////        String location = "2/4faf5d6b5b83ba0afad69e8e2e1b3853";
//        String location = "3/e7cc8319168044d3398b2f38f45d9903";
        String location = "2/c708a0bc2e274749fe316fed75263907";
//        String profile = "web-video=3446000";
//
////        HashMap<Integer, String> hashMapMD = APIMD(accessToken, location, profile);
        HashMap<Integer, String> hashMapCM = APICM(accessToken, location);
//
////        System.out.println("--------------");
////        System.out.println(hashMapMD.get(1));
////        System.out.println(hashMapMD.get(2));
//        System.out.println("--------------");
        System.out.println(hashMapCM.get(1));
        System.out.println(hashMapCM.get(2));
        System.out.println(hashMapCM.get(3));
        System.out.println(hashMapCM.get(4));
        System.out.println(hashMapCM.get(5));
//        String request = "/8/b46c0f6115f4afd01739c6c42a6cd437/web.ism/web-audio_eng=192000-=4491000-584.ts";
//        String request = "/0/0b1801a5fe40d85239141544904b3fbe/web.ism/web-video=6605000-53306500.dash";
//        String request = "/8/b46c0f6115f4afd01739c6c42a6cd437/web.ism/web-audio_eng=192000-video=4491000-584.ts";
//
//        location_fimplus(request);
//        String request = "/5/6d683bd7b9da633006ae8a40c7fdcc43/web.ism/web-audio_eng%3D127998-158016000.dash";
//
//        String location = request.substring(1, 35);
//        System.out.println(location);
//        String val_request = "/8/b46c0f6115f4afd01739c6c42a6cd437/web.ism/web-audio_eng=192000-=4491000-584.ts";
//        if (!val_request.contains("video")) {
//            System.out.println("not");
//        }
//        String ontime = "2015-11-03T07:31:56.992Z";
////        System.out.println(SetTimeIndex(ontime));
//        File database = new File("/home/soh-l/geoip_new/GeoIP2-City_20150825/GeoIP2-City.mmdb");
//        // This creates the DatabaseReader object, which should be reused across
//        // lookups.
//                DatabaseReader reader = new DatabaseReader.Builder(database).build();
//                InetAddress ipAddress = InetAddress.getByName("128.101.101.101");
//        // Replace "city" with the appropriate method for your database, e.g.,
//        // "country".
//                CityResponse response = reader.city(ipAddress);
//        
//                Country country = response.getCountry();
//                System.out.println(country.getIsoCode());            // 'US'
//                System.out.println(country.getName());               // 'United States'
//                System.out.println(country.getNames().get("zh-CN")); // '美国'
        //
        //Subdivision subdivision = response.getMostSpecificSubdivision();
        //System.out.println(subdivision.getName());    // 'Minnesota'
        //System.out.println(subdivision.getIsoCode()); // 'MN'
        //
        //City city = response.getCity();
        //System.out.println(city.getName()); // 'Minneapolis'
        //
        //Postal postal = response.getPostal();
        //System.out.println(postal.getCode()); // '55455'
        //
        //Location location = response.getLocation();
        //System.out.println(location.getLatitude());  // 44.9733
        //System.out.println(location.getLongitude()); // -93.2323
        //        int m = 61;
        //        if (m <= 5) {
        //            m = 1;
        //            System.out.println(m);
        //        } else if (m <= 10) {
        //            m = 2;
        //            System.out.println(m);
        //        } else if (m <= 30) {
        //            m = 3;
        //            System.out.println(m);
        //        } else if (m <= 60) {
        //            m = 4;
        //            System.out.println(m);
        //        } else {
        //            m = 5;
        //            System.out.println(m);
        //        }
        //        String firsttime = "2015-12-15T22:25:53.473Z";
        //        String ontime = "2015-12-15T22:26:01.950Z";
        //        long i = checkTime(firsttime, ontime);
        //        System.out.println("Check i: " + i);
        ////        String _request = "/12c7f5e0e692c30da2dd11295e0caf04/phimbo/new/nhatban/Rich%20Man.Poor.Woman/Rich.Man.Poor.Woman.E04/Rich.Man.Poor.Woman.E04-126.ts";
        //        String _request = "/6ec233e0954db122ad3fc98378d6b0ba/hdviet/_definst_/smil:mp4_03/store_09_2015/08092015/Il_Ragazzo_Invisibile_2014_1080p_BluRay_AC3_S_ViE/Il_Ragazzo_Invisibile_2014_1080p_BluRay_AC3_S_ViE_TM.smil/media_b800000_188.ts?audioindex=1";
        ////        String _request = "/9422151b2b114926a805dfd47784d608/hdviet/_definst_/smil:mp4_03/store_04_2015/13042015/Cam_Tu_Duyen_Hoa_Le_Mao_Hiem_720p_H/E006/Cam_Tu_Duyen_Hoa_Le_Mao_Hiem_720p_H_E006.smil/media_b500000_162.ts";
        //
        //        String episode = "";
        //        String sPattern2 = "\\/E\\d*\\/";// To parse eposide
        //        Pattern pPattern2 = Pattern.compile(sPattern2);
        //        Matcher m2 = pPattern2.matcher(_request);
        //
        //        if (m2.find()) {
        //            episode = m2.group(0).substring(2, 5);// get episode
        //        }
        //
        //        System.out.println(episode);
        //        String timestamp = "01/Oct/2015:02:14:51 +0700";
        //        String register_time = "2015-12-01T23:59:35.463Z";
        //        String login_time = "2015-12-15T03:36:35.463Z";
        //        String login_time = "2015-10-23T16:41:asd47.212Z";
        //        convertUTC7(login_time);
        //        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        //        Date dTime = dateFormat.parse(login_time);
        //        Calendar cal1 = Calendar.getInstance();
        //
        //        cal1.setTime(dTime);
        //        cal1.add(Calendar.HOUR_OF_DAY, 7);
        //
        //        System.out.println(cal1.getTimeZone());
        //        System.out.println(cal1.get(Calendar.HOUR_OF_DAY));
        //        System.out.println(cal1.get(Calendar.DAY_OF_MONTH));
        //        System.out.println(cal1.get(Calendar.MONTH) + 1);
        //        System.out.println(cal1.get(Calendar.YEAR) + "" + (cal1.get(Calendar.MONTH) + 1) + "" + cal1.get(Calendar.DAY_OF_MONTH));
        //
        //        DateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        //        System.out.println("Today            : " + sdf.format(dTime));
        //        String timestamp = "2015-10-02T10:00:34.631Z";
        //        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        //        Date getDayRedis = dateFormat.parse(register_time);
        //        Date getNewDay = dateFormat.parse(login_time);
        //        Calendar cal1 = Calendar.getInstance();
        //        Calendar cal2 = Calendar.getInstance();
        //        cal1.setTime(getDayRedis);
        //        cal2.setTime(getNewDay);
        //
        //        int year1 = cal1.get(Calendar.YEAR);
        //        int month1 = cal1.get(Calendar.MONTH);
        //        int day1 = cal1.get(Calendar.DAY_OF_MONTH);
        //        System.out.println(GetLastDay(register_time));
        //        System.out.println(CampareNotSureDay(register_time, login_time));
        //             Date today = new Date();
        //        Date getDayRedis = dateFormat.parse(register_time);
        ////        Date getNewDay = dateFormat.parse(login_time);
        //
        //        Calendar calendar1 = Calendar.getInstance();
        //        calendar1.setTime(getDayRedis);
        //
        //        calendar1.add(Calendar.MONTH, 1);
        //        calendar1.set(Calendar.DAY_OF_MONTH, 1);
        //        calendar1.add(Calendar.DATE, -1);
        //
        //        Date lastDayOfMonth = calendar1.getTime();
        //
        //        Calendar calendar2 = Calendar.getInstance();
        //        calendar2.setTime(lastDayOfMonth);
        //        System.out.println("Last:" + calendar2.get(Calendar.DAY_OF_MONTH));
        //
        //        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //        System.out.println("Today            : " + sdf.format(lastDayOfMonth));
        //        System.out.println("Last Day of Month: " + dateFormat.format(lastDayOfMonth));
        //        DateFormat df = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z");
        //        Date dateobj = new Date();
        //        System.out.println(dateobj);
        //        System.out.println(df.format(dateobj));
        //        Date dateLog = null;
        //        try {
        //            dateLog = dateFormat.parse(timestamp);
        //        } catch (ParseException ex) {
        //            dateLog = new Date();
        //        }
        //        Date dateLog = null;
        //        Date dateLog = new Date();
        //        String lv_dateFormateInUTC = "";//Will hold the final converted date
        //        Date lv_localDate = new Date();
        //        String lv_localTimeZone = "";
        //        SimpleDateFormat lv_formatter = null;
        //
        //        //Convert the date from the local timezone to UTC timezone
        ////Convert the date from the local timezone to UTC timezone
        ////        lv_formatter = new SimpleDateFormat("yyyyMMddHH");
        //        lv_formatter = _minuteFormatter;
        ////        lv_formatter.setTimeZone(TimeZone.getTimeZone(lv_localTimeZone));
        //
        //        lv_formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        //        lv_dateFormateInUTC = lv_formatter.format(lv_localDate);
        //        System.out.println(" The Date in the UTC time zone " + lv_dateFormateInUTC);
        //System.out.println("convertLocalTimeToUTC: "+p_city+": "+" The Date in the UTC time zone " + lv_dateFormateInUTC);
        //        Date dateLog = null;
        //
        //        dateLog = new Date();
        //        System.out.println(dateLog);
        //        SimpleDateFormat minuteFormatter = _minuteFormatter;
        //        SimpleDateFormat hourFormatter = _hourFormatter;
        //        SimpleDateFormat dayFormatter = _dayFormatter;
        //        minuteFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        //        hourFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        //        dayFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        //            String sMinuteFormatterUTC = minuteFormatter.format(dateLog);
        //            String sMinuteFormatter = _minuteFormatter.format(dateLog);
        //            String sHourFormatter = _hourFormatter.format(dateLog);
        //            String sDayFormatter = _dayFormatter.format(dateLog);
        //        String sMinuteFormatter = minuteFormatter.format(dateLog);
        //        String sHourFormatter = hourFormatter.format(dateLog);
        //        String sDayFormatter = dayFormatter.format(dateLog);
        //
        //        System.out.println(sMinuteFormatter);
        //        System.out.println(sHourFormatter);
        //        System.out.println(sDayFormatter);
        //        dateLog = new Date();
        //        SimpleDateFormat minuteFormatter = _minuteFormatter;
        //        minuteFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        //
        //        String sMinuteFormatterUTC = minuteFormatter.format(dateLog);
        //        System.out.println(" The Date in the UTC time zone " + sMinuteFormatterUTC);
        //        _minuteFormatter.setTimeZone(TimeZone.getTimeZone(""));
        //        String sMinuteFormatter = _minuteFormatter.format(dateLog);
        //        String sMinuteFormatter = _minuteFormatter.format(dateLog);
        //        String sHourFormatter = _hourFormatter.format(dateLog);
        //        String sDayFormatter = _dayFormatter.format(dateLog);
        //
        //        System.out.println(sMinuteFormatter);
        //        System.out.println(sHourFormatter);
        //        System.out.println(sDayFormatter);
        //        String tag = "bộ,mới cập nhật,các nước khác,cổ trang,võ thuật,Châu Á,Thuyết minh,Trinh Thám,Đài Loan,Điều Tra";
        //        String tag="Trung QuốcÂu Mỹ";
        //        String tag="Âu MỹHồng KôngTrung Quốc";
        //        String tag="Hồng KôngHàn Quốc";
        //        String tag="Hồng KôngTrung Quốc";
        //        String tag="Trung QuốcHàn Quốc";
        //        String tag = "Phim Trung Quốc";
        ////        String tag = "lẻ,âu mỹ,kinh dị,Bí ẩn,Mỹ";
        ////        String tag = "lẻ";
        //        System.out.println(parseTag(tag));
        //
        ////        String s="HDO:aaab";
        //        String strMovieID = "MovieID4:aaab";
        //        if (strMovieID.startsWith("H")) {
        //            System.out.println("HDO");
        //        }
        //
        //        if (strMovieID.startsWith("M")) {
        //            System.out.println("HDV");
        //        }
        //        try {
        //            String a = "/12c7f5e0e692c30da2dd11295e0caf04/phimbo/new/nhatban/Rich%20Man.Poor.Woman/Rich.Man.Poor.Woman.E04/Rich.Man.Poor.Woman.E04-126.ts";
        //            String a = "/cbf28c53c1241c7915a6a8263d6f447f/phimbo/phimhanquoc/2014/10/Running.Man/%5BM-Zone%5D.Running.Man.Ep221.HD.KITESVN.COM/%5BM-Zone%5D.Running.Man.Ep221.HD.KITESVN.COM-285.ts";
        //        String a = "/6ec233e0954db122ad3fc98378d6b0ba/hdviet/_definst_/smil:mp4_03/store_09_2015/08092015/Il_Ragazzo_Invisibile_2014_1080p_BluRay_AC3_S_ViE/Il_Ragazzo_Invisibile_2014_1080p_BluRay_AC3_S_ViE_TM.smil/media_b800000_188.ts?audioindex=1";
        //        String a = "/be381b14ffcb4f488aa65cca81a7e7cd/hdviet/_definst_/smil:mp4_03/store_07_2015/02072015/Underdog_Kids_2015_720p_WEB_DL_AC3_S/Underdog_Kids_2015_720p_WEB_DL_AC3_S.smil/media_b500000_422.ts";
        //        String a = "/3a2c9e67d58d4002b0d0ffc2e518b6cc/hdviet/_definst_/smil:mp4_02/store_04_2014/21042014/tvb_Ruse_of_Engagement_720p_HDTV/E010/TVB_Ruse_of_Engagement_720p_HDTV_E010.smil/media_b800000_163.ts";
        //        String a = "/hdo/_definst_/smil:mp4_02/store_08_2013/13082013/The_Stew_Of_Life_Am_Thuc_Cuoc_Song_SD/E010/The_Stew_Of_Life_Am_Thuc_Cuoc_Song_SD_E010_TM.smil/media_b1500000_219.ts?audioindex=1";
        //        String a = "/220d6bd12a09492b95839cfd7e6b1da3/hdviet/_definst_/smil:mp4_03/store_05_2014/28052014/Endless_Love_2014_1080_BluRay_AC3_TM/Endless_Love_2014_1080_BluRay_AC3_TM_TM.smil/media_b2500000_419.ts?audioindex=1";
        //        String a = "/2dbcf7f58eecc2e1bb9f142eb11a0879/hdviet/_definst_/smil:mp4_03/store_05_2015/19052015/The_SpongeBob_Movie_Sponge_Out_of_Water_2015_720p_HC_WEBRip_H_ViE/The_SpongeBob_Movie_Sponge_Out_of_Water_2015_720p_HC_WEBRip_H_ViE.smil/media_b1800000_60.ts";
        //        String a = "/9422151b2b114926a805dfd47784d608/hdviet/_definst_/smil:mp4_03/store_04_2015/13042015/Cam_Tu_Duyen_Hoa_Le_Mao_Hiem_720p_H/E006/Cam_Tu_Duyen_Hoa_Le_Mao_Hiem_720p_H_E006.smil/media_b500000_162.ts";
        //        String a = "/a4fc4aadf264453a845fc245b6e65452/hdviet/_definst_/smil:mp4_02/store_08_2013/06082013/mud_2012_1080p_bluray_x264_sparks/mud_2012_1080p_bluray_x264_sparks_AC3.smil/media_b2700000_151.ts?audioindex=2&audioindex=2";
        //        String request = "/hdviet/_define_/mp4_03/store_06_2015/23062015/Hoa_Thien_Cot_720p_Uncut_ViE/E007/Hoa_Thien_Cot_720p_Uncut_ViE_E007_640.mp8/media_2.ts";
        //            System.out.println(URLDecoder.decode(a, "UTF-8"));
        //        System.out.println(audio(request));
        //
        //        if (request.contains("olivia2")) {
        //            System.out.println(request.contains("olivia2"));
        //            System.out.println("olivia2");
        //        } else if (request.contains("mp4/media")) {
        //            System.out.println(request.contains("mp4/media"));
        //            System.out.println("mp4/media");
        //        } else if (!request.contains(".ts")) {
        //            System.out.println(!request.contains(".ts"));
        //            System.out.println(".ts");
        //
        //        }else {
        //            System.out.println("a");
        //        }
        //        System.out.println(CheckExistv2(request));
//                File database = new File("/home/soh-l/geoip_new/GeoIP2-City_20150825/GeoIP2-City.mmdb");
//                DatabaseReader reader = new DatabaseReader.Builder(database).build();
//                InetAddress ipAddress = InetAddress.getByName("123.30.135.82");
//                CityResponse response = reader.city(ipAddress);
//                Country country = response.getCountry();
//                System.out.println(country.getName());
//                City city = response.getCity();
//                System.out.println(city.getName());
//                String tmp = "100.97.145.94";//isp: fpt, city: Hoc Chi Minh City, Country: Viet nam
//        
//                if (tmp.startsWith("100.")) {
//                    System.out.println("isp: fpt");
//                    System.out.println("city: Ho Chi Minh City");
//                    System.out.println("Country: Vietnam");
//                }else{
//                    System.out.println("a");
//                }
        //
        //        String csvFile = "/home/soh-l/Downloads/table_pro.csv";
        //        BufferedReader br2 = null;
        //        String line = "";
        //        String cvsSplitBy = ",";
        ////
        //////        String[] arr = null;
        //        HashMap<String, String> hashMapPro = new HashMap<>();
        //
        //        try {
        //            br2 = new BufferedReader(new FileReader(csvFile));
        //            while ((line = br2.readLine()) != null) {
        //
        //                // use comma as separator
        //                String[] country = line.split(cvsSplitBy);
        ////
        //////                System.out.println(country[0]);
        ////                System.out.println("Country [code= " + country[0]
        ////                        + " , name=" + country[1] + "]");
        //                hashMapPro.put(country[0], country[2]);
        ////                System.out.println(arr[i]);
        //            }
        //
        //        } catch (FileNotFoundException e) {
        //            e.printStackTrace();
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        } finally {
        //            if (br2 != null) {
        //                try {
        //                    br2.close();
        //                } catch (IOException e) {
        //                    e.printStackTrace();
        //                }
        //            }
        //        }
        //
        //        File database = new File("/home/soh-l/Downloads/GeoIP2-City_20150825/GeoIP2-City.mmdb");
        //        DatabaseReader reader = null;
        //        FileWriter writer = null;
        //        try {
        //            writer = new FileWriter("/home/soh-l/Downloads/db_city.txt");
        //        } catch (IOException ex) {
        //            Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //
        //        try {
        //            reader = new DatabaseReader.Builder(database).build();
        //        } catch (IOException ex) {
        //            Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //
        //        try (BufferedReader br = new BufferedReader(new FileReader("/home/soh-l/Downloads/temp_ip.txt"))) {
        //
        //            String sCurrentLine;
        //
        //            while ((sCurrentLine = br.readLine()) != null) {
        ////                System.out.println(sCurrentLine);
        ////                arrIP[i] = sCurrentLine;
        //
        //                InetAddress ipAddress;
        //                try {
        //                    ipAddress = InetAddress.getByName(sCurrentLine);
        //
        ////                    System.out.println(ipAddress);
        //                    CityResponse response = reader.city(ipAddress);
        //
        ////                    Country country = response.getCountry();
        ////                System.out.println(country.getName());
        //                    City city = response.getCity();
        ////                System.out.println(city.getName()); // 'Minneapolis'
        //
        //                    writer.append(sCurrentLine);
        //                    writer.append(',');
        //                    writer.append(city.getName());
        //                    writer.append(',');
        //                    writer.append(hashMapPro.get(city.getName()));
        //                    writer.append('\n');
        //
        //                } catch (UnknownHostException ex) {
        //                    Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //                } catch (IOException | GeoIp2Exception ex) {
        //                    Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //                }
        ////                System.out.println(arrIP[i]);
        ////                i++;
        //
        //            }
        //
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
        //
        //        System.out.println("Done to get data to arrIP");
        //        File database = new File("/home/soh-l/Downloads/GeoIP2-City_20150825/GeoIP2-City.mmdb");
        //        DatabaseReader reader = null;
        //        FileWriter writer = null;
        //        try {
        //            writer = new FileWriter("/home/soh-l/Downloads/db_city.csv");
        //        } catch (IOException ex) {
        //            Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //
        //        try {
        //            reader = new DatabaseReader.Builder(database).build();
        //        } catch (IOException ex) {
        //            Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //        for (int j = 0; j < arrIP.length; j++) {
        ////            InetAddress ipAddress = InetAddress.getByName("128.101.101.101");
        ////            InetAddress ipAddress = InetAddress.getByName("210.245.122.104");
        ////            System.out.println(arrIP[j]);
        ////            String tmp = arrIP[j].substring(1, arrIP[j].length() - 1);
        //            String tmp = arrIP[j];
        ////    
        //
        //
        //
        //        }
        //        InetAddress ipAddress = InetAddress.getByName("100.97.145.94");
        //        CityResponse response = reader.city(ipAddress);
        //        Country country = response.getCountry();
        //        System.out.println(country.getName());
        //        City city = response.getCity();
        //        System.out.println(city.getName());
        // This creates the DatabaseReader object, which should be reused across
        // lookups.
        //                    String tmp = "100.97.145.94";//isp: fpt, city: Hoc Chi Minh City, Country: Viet nam
        //        
        //        DatabaseReader reader = new DatabaseReader.Builder(database).build();
        //        for (int j = 0; j < arr.length; j++) {
        ////            InetAddress ipAddress = InetAddress.getByName("128.101.101.101");
        ////            InetAddress ipAddress = InetAddress.getByName("210.245.122.104");
        //            System.out.println(arr[j]);
        ////            String tmp = arr[j].substring(1, arr[j].length() - 1);
        ////            System.out.println(tmp);
        ////            String tmp = "210.245.122.104";
        ////            String tmp = "100.97.145.94";//isp: fpt, city: Ho Chi Minh City, Country: Viet nam
        //            if (tmp.startsWith("100")){
        //                System.out.println("isp: fpt");
        //                System.out.println("city: Ho Chi Minh City");
        //                System.out.println("Country: Viet nam");
        //}
        //            
        //            InetAddress ipAddress = InetAddress.getByName(tmp);
        //            System.out.println(ipAddress);
        //            CityResponse response = reader.city(ipAddress);
        //
        //            com.maxmind.geoip2.record.Country country = response.getCountry();
        ////            System.out.println(country.getIsoCode());            // 'US'
        //            System.out.println(country.getName());
        //
        //            City city = response.getCity();
        //            System.out.println(city.getName()); // 'Minneapolis'
        //        }
        //        InetAddress ipAddress = InetAddress.getByName("128.101.101.101");
        //
        //// Replace "city" with the appropriate method for your database, e.g.,
        //// "country".
        //        CityResponse response = reader.city(ipAddress);
        //
        //        com.maxmind.geoip2.record.Country country = response.getCountry();
        //        System.out.println(country.getIsoCode());            // 'US'
        //        System.out.println(country.getName());               // 'United States'
        //        System.out.println(country.getNames().get("zh-CN")); // '美国'
        //
        //        Subdivision subdivision = response.getMostSpecificSubdivision();
        //        System.out.println(subdivision.getName());    // 'Minnesota'
        //        System.out.println(subdivision.getIsoCode()); // 'MN'
        //
        //        City city = response.getCity();
        //        System.out.println(city.getName()); // 'Minneapolis'
        //
        //        Postal postal = response.getPostal();
        //        System.out.println(postal.getCode()); // '55455'
        //
        //        Location location = response.getLocation();
        //        System.out.println(location.getLatitude());  // 44.9733
        //        System.out.println(location.getLongitude()); // -93.2323
        //        String redisHost = "localhost";
        //
        //        RedisClient client = new RedisClient(redisHost, 6379);
        //        RedisConnection<String, String> _redis = client.connect();
        //        System.out.println(_redis.ping());
        //        String product = "hdo1";
        //        String kei = "MovieID4:store6/08032013/Borat_2006_1080p_BluRay_DTS_x264_HDC/Borat_2006_1080p_BluRay_DTS_x264_HDC";
        //        String kei = "MovieID4:tvshow/True_Blood_S02/xxx/True_Blood_S02";
        //        String kei = "MovieID4:mp4_03/store_06_2014/04062014/Trai_Tim_Toi_Tinh_v2/xxx/Trai_Tim_Toi_Tinh";
        //        String kei = "HDO:phimbo/new/thailan/Koo.Kam/Koo.Kam.E01.HD";
        //
        //        if (product.equals("hdo")) {
        //
        //            if (_redis.hexists(kei, "Category")) {
        //                String category_tmp1 = _redis.hget(kei, "Category");
        //                System.out.println(category_tmp1);
        //                category_tmp1 = category_tmp1.replaceAll(" ", "_");
        //                System.out.println(category_tmp1);
        //                String category = category_tmp1.replaceAll(",", " ");
        //                System.out.println(category);
        //
        //            }
        //
        //        } else {
        //
        //            if (_redis.hexists(kei, "Category_v2")) {
        //                String category_tmp1 = _redis.hget(kei, "Category_v2");
        //                System.out.println(category_tmp1);
        //                String category_tmp2 = category_tmp1.replaceAll(" ", "_");
        //                System.out.println(category_tmp2);
        //                String category = category_tmp2.replaceAll(",|/", " ");
        //                System.out.println(category);
        //
        //            }
        //        }
        //        System.out.println(tmp);
        //        String tmp2 = "";
        //        String[] arr = tmp.split(",|/");
        ////        String[] arr = tmp.split("/");
        //        for (String arr1 : arr) {
        ////            System.out.println(arr1.replace(" ", "_") + " ");
        //            tmp2 = tmp2 + arr1.replace(" ", "_") + " ";
        //
        //        }
        //        System.out.println(tmp2);
        //        String _request = "/07f09062356846b8996c92f24b1716c4/hdviet/_definst_/smil:mp4_03/store_08_2015/04082015/Last_2015_720p_S/E006/Last_2015_720p_S_E006.smil/media_b500000_184.ts";
        //        String _request = "/1a98725ae083405c8d72a6bd3a24249e/hdviet/_definst_/smil:mp4_03/store_08_2015/04082015/Last_2015_720p_S/E006/Last_2015_720p_S_E006.smil/media_b500000_184.ts";
        //        String _request = "http://s16.phimhd3s.com:80/hdo/_definst_/smil:store_06_2013/17062013/The_Last_Boy_Scout_1991_BluRay_DTS_dxva_LoNeWolf/The_Last_Boy_Scout_1991_BluRay_DTS_dxva_LoNeWolf.smil/media_b1500000_240.ts";
        //        String accessToken = "5fd3ad5e38254e61b099ed3cdf23bbbe";
        //        String accessToken = "be5d06e3d5bc40a2a98f7a7b458b88e8";
        //        String accessToken = null;
        //        String loginUser = null;
        //        String user = null;//vip, free or anonymous
        //
        //        String sPattern6 = "^\\/(\\w+)";
        //
        //        Pattern pPattern6 = Pattern.compile(sPattern6);
        //        Matcher m6 = pPattern6.matcher(_request);
        //
        //        if (m6.find()) {
        //            accessToken = m6.group(1);
        //            System.out.println(accessToken.length());
        //        } else {
        //            accessToken = "soh";
        //            System.out.println(accessToken.length());
        //        }
        //        String CASaccessToken = "CAS:" + accessToken;
        //
        //        if (_redis.hexists(CASaccessToken, "accessToken")) {
        //            loginUser = _redis.hget("CAS:" + accessToken, "loginUser");
        //            user = _redis.hget("CAS:" + accessToken, "user");
        //            System.out.println("In redis");
        //            System.out.println("loginUser: " + loginUser);
        //            System.out.println("user: " + user);
        //
        //        } else {
        //            HashMap<Integer, String> isCAS = CheckCAS(accessToken, 1);// 1 is login
        //            loginUser = isCAS.get(1);
        //            user = isCAS.get(2);
        //
        //            _redis.hset(CASaccessToken, "loginUser", loginUser);
        //            _redis.hset(CASaccessToken, "user", user);
        //            _redis.hset(CASaccessToken, "accessToken", accessToken);
        //            _redis.expire(CASaccessToken, 7200);
        //
        //            System.out.println("Out redis");
        //            System.out.println("loginUser: " + loginUser);
        //            System.out.println("user: " + user);
        //
        //        }
        //
        //        System.out.println(isCAS.get(0));
        //        System.out.println(isCAS.get(1));
        //        Gson gson = new GsonBuilder().create();
        //        Gson gson = new Gson();
        //        gson.toJson("Hello", System.out);
        //        gson.toJson(123, System.out);
        //        String redisHost = "localhost";
        //        int redisPort = 6379;
        //
        //        RedisClient client = new RedisClient(redisHost, redisPort);
        //        _redis = client.connect();
        //        System.out.println(_redis.ping());
        //
        //        System.out.println(_redis.get("a"));
        //        _redis.quit();
        //        String timestamp = "2015-07-30T07:04:05.725Z";
        //
        //        Date dateLog = null;
        //
        //        try {
        //            dateLog = dateFormat.parse(timestamp);
        //        } catch (ParseException ex) {
        //            dateLog = new Date();
        //        }
        //
        //        String sMinuteFormatter = _minuteFormatter.format(dateLog);
        //        String sHourFormatter = _hourFormatter.format(dateLog);
        ////        System.out.println(dateLog.getMinutes());
        ////        System.out.println(sMinuteFormatter);
        //        int i = dateLog.getMinutes() / 5 + 1;
        //        System.out.println(i / 5);
        //        System.out.println("5m: " + sHourFormatter + String.valueOf(i));
        //
        ////        System.out.println("5m" + sHourFormatter + "02");
        //
        ////        String sKeySession = sMinuteFormatter + ":session:";
        ////        String sSession = "a2";
        ////        if (!_redis.hexists(sKeySession, sSession)) {
        ////            _redis.hset(sKeySession, sSession, "1");
        ////            _redis.expire(sKeySession, 600);
        ////        }
        //        System.out.println("end");
        //
        //        long getTimeRedis = dateFormat.parse(oldregister_time).getTime();
        //        long getTime = dateFormat.parse(newregister_time).getTime();
        //        int tmp = ConvertDay(getTime, getTimeRedis);
        ////        String msg = "113.163.130.77" + "Mobile-Safari";
        //        String msg = "113.163.130.77" + "Chrome_39.0";
        ////        f190f72ddb7e783e0f2c6b3232fe2fbe
        ////        09f8e0732ec0ccad9dda01d00d427fbe
        //        StringBuilder sb = new StringBuilder();
        ////        try {
        //
        //        MessageDigest md5 = MessageDigest.getInstance("MD5");
        //        md5.update(msg.getBytes());
        //        byte byteData[] = md5.digest();
        //
        //        for (int i = 0; i < byteData.length; i++) {
        //
        //            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        //
        //        }
        //
        //        System.out.println(sb.toString());
        //        String vhost = "cvdcw3.vn-hd.com";
        ////        String vhost = "cvdcw3vip.vn-hd.com";
        ////        String vhost = "cvdcw3.phimhd3s.com";
        //        String _vhost = "";
        //
        //        _vhost = vhost;
        //        
        //        if (_vhost.contains("phimhd3s")) {
        ////            return "hdo";
        //            System.out.println("hdo");
        //        } else if (_vhost.contains("vip.vn-hd")) {
        //            System.out.println("vip_hdviet");
        //        } else {
        //            System.out.println("hdviet");
        //    }
        //        Pattern pPattern = Pattern.compile(sPattern);
        //        Matcher m = pPattern.matcher(_request);
        //
        //        if (m.find()) {
        //
        //            String sproduct = m.group(0);
        //
        //            if (sproduct.equals("vn-hd")) {
        //                product = "hdviet";
        //            }
        //
        //            if (sproduct.equals("vip.vn-hd")) {
        //                product = "vip_hdviet";
        //            }
        //
        //            if (sproduct.equals("phimhd3s")) {
        //                product = "hdo";
        //            }
        //
        //        }
        //        {
        //            if (product == null) {
        //                product = "soh";
        //            }
        //        }
        //
        //        System.out.println(product);
        //        return product;
        //        String request = "/4d18d/phimle/2015/07/X-Me0p.Blu/X-Men.Days4-222.ts";
        ////        String request = "/fffdc6df03396e5fadc8f8248e9cb535/phimbo/hanquoc/Tinh_Dau_2015_720p/Tinh_Dau_2015_720p_E014/Tinh_Dau_2015_720p_E014-272.ts";
        //        String request = "/809ac2037d94c04cf0969734fb1c7fa4/phimle/2015/07/Bloody.Destiny.2015.720p.TM/Blood.Destiny.2015.720p.TM-780.ts";
        //
        //        String _request = request;
        //
        //        String sPattern = "^\\/\\w+\\/(.*.)\\/.*.ts$";
        //
        //        Pattern pPattern = Pattern.compile(sPattern);
        //        Matcher m = pPattern.matcher(_request);
        //
        //        if (m.find()) {
        //
        //            String vhostTmp = m.group(1);
        //            System.out.println(vhostTmp);
        //
        //        }
        ////        String request = "http://cdn.olivixa24.com:80/webtretho/_definst_/smil:youtubenew/2014/12/TfOdjnF8uHU/TfOdjnF8uHU.smil/media_w268429829_b1344708_31.0ts";
        //        String request = "vn-hd|vip.vn-hd|phimhd3s";
        //
        //        if (request.contains("olivia2") || (!request.contains(".ts"))) {
        ////            return false;
        //            System.out.println("false");
        //        } else {
        //            System.out.println("true");
        //
        //        }
        //        System.out.println(request.contains(".ts"));
        //        System.out.println(request.contains(".olivia24"));
        //    }
        //        String bytes = "60785480178";
        //        Float floatMB = (Float.parseFloat(bytes) / (1024 * 1024));
        //        DecimalFormat dFormat = new DecimalFormat("#.######");
        //        Float floatRoundMB = Float.valueOf(dFormat.format(floatMB));
        //
        //        System.out.println(floatRoundMB);
        //
        //    }
        //        String request = "_b35000F00_460.ts?audioindex=1";
        ////        String _request = ".ts";
        //        String request = "_TM.smil/media_b3500000_460.m3u8?audioindex=1";
        //        String _pattern = ".ts";
        //        int flag = 0;
        //
        //        Pattern pt = Pattern.compile(_pattern);
        //        Matcher m = pt.matcher(request);
        //
        //        if (m.find()) {
        //
        //            flag = 1;
        //
        //        }
        //
        //        System.out.println(flag == 1);
        //        String request = "/847549989fa3fae8b23214a70feba3ba/hdviet/_definst_/smil:mp4_03/store_06_2015/19062015/Girl_House_2014_1080p_BluRay_AC3_S/Girl_House_2014_1080p_BluRay_AC3_S.smil/media_b800000_49.ts";
        //        String request = "/8d18980997c1b2d8ebb93a00d0b971c4/hdviet/_definst_/smil:mp4_02/store_07_2013/29072013/Naruto_Shippuuden_v2/E342/Naruto_Shippuuden_E342.smil/media_b1500000_4.ts";
        //        String sPattern1 = "il:[^\\t]+.sm";
        //        String sPattern2 = "\\/E\\d*\\/";
        //        Pattern pPattern1 = Pattern.compile(sPattern1);
        //        Pattern pPattern2 = Pattern.compile(sPattern2);
        //        Matcher m1 = pPattern1.matcher(request);
        //        System.out.println(m1.toString());
        //        Matcher m2 = pPattern2.matcher(request);
        //        System.out.println(m2.toString());
        //        int iT = 3;
        //        if (m2.find()) {
        //
        //            LOG.info(m1.toString());
        //            System.out.println(m2.group(0));
        //
        //            String episode = m2.group(0).substring(1, 5);
        //            System.out.println(episode);
        //            iT = 8;
        //        }
        //
        //        if (m1.find()) {
        //            System.out.println(m1.group(0));
        //
        //            String sResult = m1.group(0);
        //            String sMovieID = "MovieID3:" + sResult.substring(3, sResult.length() - iT).replaceAll(sPattern2, "/xxx/");
        //
        //            System.out.println(sMovieID);
        //        }
        //        String host = "abc.com";
        //        host =host.replace(".", "_");
        //        System.out.println(host);
        //        
        ////        (new Timer("updater")).schedule(new TimerTask() {
        //
        //            @Override
        //            public void run() {
        ////                    redis.publish("counters", "ccuid");
        //                Date dDateNow = new Date();
        //                String sminuteFormatter = minuteFormatter.format(dDateNow);
        //                Long lminuteFormatter = Long.parseLong(sminuteFormatter)-1;
        //               sminuteFormatter=lminuteFormatter.toString();
        //                System.out.println(sminuteFormatter);
        //                
        //                String sSecondFormatter = secondFormatter.format(dDateNow);
        //                System.out.println(sminuteFormatter);
        //                System.out.println(sSecondFormatter);
        //                
        ////                try {
        //////                    Thread.sleep(2000);
        ////                } catch (InterruptedException ex) {
        ////                }
        //            }
        //
        //        }, 1000,60000);
        //        String info;
        //        info = sHashMap("hinfo", "vdcw3-vip.vn-hd.com");
        //        System.out.println(info);
        //        Float sValTmp2 = MyUtils.functionRound("11.222");
        //        System.out.println(sValTmp2.toString());
        //        String sVhost = "";
        //        String sRqu = "http://vtw3.vn-hd.com:80/hdviet/_definst_/smil:mp4_03/store_04_2015/20042015/The_Messengers_2015_S01_720p_S/E004/The_Messengers_2015_S01_720p_S_E004.smil/media_b800000_157.ts";
        //        String sPattern = "//[^\\t]+:80";
        //
        //        Pattern pPattern = Pattern.compile(sPattern);
        //        Matcher m = pPattern.matcher(sRqu);
        //
        //        if (m.find()) {
        //
        //            String sVhostT1 = m.group(0);
        //            String sVhostT2 = sVhostT1.substring(2, sVhostT1.length() - 3);
        //            sVhost = "\"vhost\":\"" + sVhostT2 + "\",";
        //
        //        }
        //        System.out.println(sVhost);
        //    }
        //        Date dNow = new Date();
        //        String sKeyDayst = minuteFormatter.format(dNow);
        //        String sByte = "1049579";
        //
        //        Float fByteT = Float.parseFloat(sByte);
        //        System.out.println(fByteT);
        //        Float fMbs = (fByteT / (1024 * 1024)) * 8;
        //        System.out.println(fMbs);
        //
        //        DecimalFormat dF = new DecimalFormat("#.##");
        //        Float fByte = Float.valueOf(dF.format(fMbs));
        //
        //        System.out.println(fByte);
        //    }
        //        try {
        //            String ISP = "Other";
        //        String sIsp = "";
        ////                String sIP = obj.clientip;
        //////        String sIsp = "";
        ////            String sIsp = "Dai IP dong su dung cho ket noi xDSL";
        ////            
        //////        String sIP = obj.clientip;
        //        String sIP = "210.245.18.152";
        ////            String sIP = "210.245.10.199";
        ////            String sIP = "210.245.14.4";
        ////            String sIP = "58.187.86.102";
        ////            String sIP = "118.70.129.99";
        //
        //            String sIP = "203.162.0.181";//vnpt
        //            String sIP = "222.252.27.11";//vnpt
        ////            String sIP = "123.30.175.163";
        ////            String sIP = "125.212.209.198";
        ////            String sIP = "203.205.58.163";
        ////            String sIP = "1.54.85.110";
        ////            String sIP = "42.117.49.166";
        ////            String sIP = "42.112.240.250";
        ////            String sIP = "100.65.172.171";
        ////            String sIP = "113.164.15.165";
        ////            String sIP = "100.64.86.23";
        //            String sIP = "118.71.7.89";
        //        String sIP = "118.70.128.213";
        //            String sIP = "100.98.119.144";
        ////
        //            InetAddress ipAddress = InetAddress.getByName(sIP);
        //
        //            LookupService isp = new LookupService("/home/soh-l/geoip/GeoIPISP.dat");
        ////            LookupService isp = new LookupService("/adv/logs-ana/GeoIPISP.dat");
        //            String sIsp = isp.getOrg(ipAddress);
        //            System.out.println("ISP: " + isp.getOrg(ipAddress));
        //            System.out.println("ISP: " + isp.getOrg(sIP));
        ////            System.out.println("ISP: " + isp.getDatabaseInfo());
        //         //   isp.close();
        //
        //            ISP = sHashMap("hISP", sIsp);
        ////
        //            System.out.println("ISP: " + ISP);
        //        } catch (IOException ex) {
        //            Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //    }
        //
        //        String sIP = "100.98.119.144";
        ////        String sIP = "100.64.7.73";
        //        String sIP = "1.54.171.106";
        //        String cityName;
        //        String countryName;
        ////
        //        try {
        //            LookupService ctcn = new LookupService("/home/soh-l/geoip_new/GeoIPCityvn.dat",
        //                    LookupService.GEOIP_MEMORY_CACHE);
        //            Location lt = ctcn.getLocation(sIP);
        //            try {
        //                cityName = lt.city;
        //            } catch (Exception e) {
        //                cityName = "soh";
        //            }
        //            
        //            countryName = lt.countryName;
        //            System.out.println(cityName);
        ////            System.out.println(countryName);
        ////
        //////            System.out.println("\n countryName: " + lt.countryName
        //////                    + "\n city: " + lt.city
        //////                    + "\n latitude: " + lt.latitude
        //////                    + "\n longitude: " + lt.longitude);
        ////            ctcn.close();
        //        } catch (IOException ex) {
        //            System.out.println("F");
        //        }
        //    }
        //        try {
        //            File database = new File("/home/soh-l/geoip_new/GeoIP2-ISP.mmdb");
        //            DatabaseReader reader = new DatabaseReader.Builder(database).build();
        //            InetAddress ipAddress = InetAddress.getByName(sIP);
        //            IspResponse response = reader.isp(ipAddress);
        //
        //            System.out.println(response.getAutonomousSystemNumber());       // 217
        //            System.out.println(response.getAutonomousSystemOrganization()); // 'University of Minnesota'
        //            System.out.println(response.getIsp());                          // 'University of Minnesota'
        //            System.out.println(response.getOrganization());                 // 'University of Minnesota'
        ////            File database = new File("/path/to/GeoIP2-ISP.mmdb");
        //            File database = new File("/home/soh-l/geoip_new/GeoIP2-ISP.mmdb");
        //            DatabaseReader reader = new DatabaseReader.Builder(database).build();
        //            InetAddress ipAddress = InetAddress.getByName(sIP);
        //            IspResponse response = reader.isp(ipAddress);
        //
        //            sIsp = response.getIsp();
        //
        //            System.out.println(sIsp);
        //        } catch (IOException | GeoIp2Exception ex) {
        //            Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //    }
        //            LookupService ispl = new LookupService("/home/soh-l/GeoLiteCity.dat");
        //            LookupService ispl = new LookupService("/home/soh-l/GeoIPOrg.dat");
        //            LookupService ispl = new LookupService("/home/soh-l/GeoIPISP.dat");
        //            LookupService citylookup = new LookupService("/home/soh-l/geoip/GeoIPCity.dat", LookupService.GEOIP_MEMORY_CACHE);
        //
        //            Location record = citylookup.getLocation(sIP);
        //            System.out.println("countryCode: " + record.countryCode);
        //            citylookup.close();
        //            System.out.println(ispl.getOrg(ipAddress));
        //            System.out.println(ispl.getOrg(ipAddress));
        //
        //        try {
        //
        //            File database = new File("/home/soh-l/Downloads/MaxMind-DB-master/test-data/GeoIP2-ISP-Test.mmdb");
        //            DatabaseReader reader = new DatabaseReader.Builder(database).build();
        //            InetAddress ipAddress = InetAddress.getByName(sIP);
        //            IspResponse response = reader.isp(ipAddress);
        //
        //            sIsp = response.getIsp();
        ////            System.out.println(response.getIsp());
        ////            System.out.println(response.getOrganization());                              
        //        } catch (IOException | GeoIp2Exception ex) {
        //            Logger.getLogger(a_main.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //        String sVal = "1000000";
        //        ISP = sHashMap("hISP", sIsp);
        //        String profile = sHashMap("hProfile", sVal);
        //
        //        System.out.println("ISP: " + ISP);
        //        System.out.println("profile: " + profile);
        //        String product = "";
        //////        String s = "s27.phimhd3s.com";
        //        String s = "f-14vip.vn-hd.com";
        //        String sVhost = s;
        //////        String sVhost = obj.vhost;
        //        String sPattern = "vn-hd|vip.vn-hd|phimhd3s";
        //
        //        Pattern pPattern = Pattern.compile(sPattern);
        //        Matcher m = pPattern.matcher(sVhost);
        //
        //        if (m.find()) {
        //            String sproduct = m.group(0);
        //            if (sproduct.equals("vn-hd")) {
        //                product = "hdviet";
        //            }
        //
        //            if (sproduct.equals("vip.vn-hd")) {
        //                product = "vip_hdviet";
        //            }
        //
        //            if (sproduct.equals("phimhd3s")) {
        //                product = "HDO";
        //            }
        //        }
        //
        //        System.out.println(product);
        //    }
        //        Float fT = Float.parseFloat("0.478");
        ////        Float fT = Float.parseFloat("0.000");
        //        Integer iB = Integer.parseInt("3133208");
        //        if (fT.equals(Float.parseFloat("0.000"))) {
        //            fT = Float.parseFloat("1");
        //        }
        //        Float fMbs = ((iB / fT) / (1024 * 1024)) * 8;
        //
        //        System.out.println(String.valueOf(fMbs));
        //        System.out.println(String.valueOf((iB / fT)));
        //
        //        DecimalFormat dF = new DecimalFormat("#.##");
        //        Float fSpeedLoad = Float.valueOf(dF.format(fMbs));
        //
        //        System.out.println(fSpeedLoad);
        //        YourObject parsed = new Gson().fromJson(jsons, YourObject.class);
        //        String jsons = "{'appname2':'application2','appname':'application', 'Version':'0.1.0', 'UUID':'300V', 'WWXY':'310W', 'ABCD':'270B', 'YUDE':'280T'}";
        //        YourObject parsed = new Gson().fromJson(jsons, YourObject.class);
        //        System.out.println(parsed.appname2);
        //        System.out.println(parsed.UUID);
        //        JsonObject object = new JsonParser().parse(jsons).getAsJsonObject();
        //        object.get("appname"); // application
        //        object.get("Version"); // 0.1.0
        //        String sAgent = "AppleCoreMedia/1.0.0.11D257 (iPad; U; CPU OS 7_1_2 like Mac OS X; vi_vn)";
        //        String sAgent = "Mozilla/5.0 (Linux; U; Android 4.1.2; vi-vn; LG-F180 Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30 [FB_IAB/FB4A;FBAV/34.0.0.0.82;]";
        //        String sAgent = "Mozilla/5.0 Gecko/20100115 Firefox/3.6";
        //        String sAgent = "Mozilla/5.0 Gecko/20100115 Firefox/3.6";
        //        String sAgent = "Mozilla/5.0 (Linux; U; Android 4.0.3; en-us; HTC_PH39100/3.26.502.56 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";
        //        String sAgent = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36";
        ////        String sAgent = "Mozilla/5.0 (Windows NT 5.1; rv:37.0) Gecko/20100101 Firefox/37.0";
        //        String sAgent = "LG-V400/V10d Player/LG Player 1.0 for Android 4.4.2 (stagefright alternative)";
        //    String sAgent = "(DuneHD/1.0 (product_id: hdagenttv_301; firmware_version: 150227_0032_b9)";
        ////        String sAgent = "Mozilla/5.0 (compatible; MSIE 9.0; Windows Phone OS 7.5; Trident/5.0; IEMobile/9.0)";
        ////        String sAgent = "Windows Phone Search (Windows Phone OS 7.10;NOKIA;Lumia 900;7.10;8862)";
        ////        String sAgent = "Mozilla/5.0 (BlackBerry; U; BlackBerry 9900; fr) AppleWebKit/534.11+ (KHTML, like Gecko) Version/7.0.0.296 Mobile Safari/534.11+";
        ////        String sAgent = "Mozilla/5.0 (SymbianOS/9.4; Series60/5.0 NokiaX6-00/20.0.005; Profile/MIDP-2.1 Configuration/CLDC-1.1 ) AppleWebKit/525 (KHTML, like Gecko) Version/3.0 BrowserNG/7.2.3";
        ////        String sAgent = "Mozilla/5.0 (Series40; NokiaX3-02/le6.32; Profile/MIDP-2.1 Configuration/CLDC-1.1) Gecko/20100401 S40OviBrowser/2.0.2.62.10";
        ////        String sAgent = "(Linux armv7l ; U; HbbTV/1.1.1 (; TOSHIBA; 32SL863; 19.2.39.208; 3; ) ; ToshibaTP/1.1.1 () ; en)";
        ////        String sAgent = "Mozilla/5.0 (Linux; Android 4.4.2; l5450 Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Safari/537.36";
        ////        String sAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.5.17 (KHTML, like Gecko) Version/7.1.5 Safari/537.85.14";
        //        String sAgent = "stagefright/1.2 (Linux;Android 4.1.2)";
        //    String _agent = sAgent;
        //    Parser uaParser = new Parser();
        //    ClientUA agent = uaParser.parse(sAgent);
        //    String agentType;
        //    String agentDevice;
        //    String agentOS;
        //    agentType  = agent.userAgent.family.replaceAll(" ", "-");
        //
        //    if (agent.userAgent.major
        //
        //    
        //        != null) {
        //            agentType = agentType + '_' + agent.userAgent.major;
        //    }
        //    if (agent.userAgent.minor
        //
        //    
        //        != null) {
        //            agentType = agentType + '.' + agent.userAgent.minor;
        //    }
        //
        //    System.out.println (agentType);
        //    System.out.println (agent.device.family);
        //
        //    System.out.println (agent.os.family);
        //
        //    agentDevice  = agent.device.family.replaceAll(" ", "_");
        //    agentOS  = agent.os.family.replaceAll(" ", "_");
        ////        
        //    switch (agentDevice
        //
        //    ) {
        //            case "iPhone":
        //                agentDevice = "iphone";
        //                break;
        //            case "iPad":
        //                agentDevice = "ipad";
        //                break;
        //            case "iPod":
        //                agentDevice = "ipod";
        //                break;
        //            default:
        //                agentDevice = "other1";
        //                break;
        //        }
        //        if (agentDevice.equals("other")) {
        //            if (agentOS.startsWith("Windows")) {
        //                agentDevice = "PC_Win";
        //                if (agentOS.startsWith("Windows_P")) {
        //                    agentDevice = "unWin_mobile";
        //                }
        //            } else if (agentOS.startsWith("Mac")) {
        //                agentDevice = "PC_Mac";
        //            } else if (agentOS.startsWith("Linux")) {
        //                agentDevice = "PC_Linux";
        //            } else if (sAgent.substring(1, 7).equals("DuneHD")) {
        //                agentDevice = sAgent.substring(1, 7);
        //            }
        //            if (agentOS.startsWith("Android")) {
        //                if (agentType.startsWith("Android")) {
        //                    agentDevice = "android";
        //                }
        //            }
        ////        }
        //    System.out.println (
        //
        //    "DV1:" + agentDevice);
        //
        //        if (agentDevice.equals ( 
        //        "other1")) {
        //            
        //            if (agentOS.startsWith("Windows")) {
        //
        //            agentDevice = "pc_win";
        //            if (agentOS.startsWith("Windows_P")) {
        //                agentDevice = "win_phone";
        //            }
        //
        //        } else if (agentOS.startsWith("Mac")) {
        //
        //            agentDevice = "pc_mac";
        //
        //        } else if (agentOS.startsWith("Linux")) {
        //
        //            agentDevice = "pc_linux";
        //
        //        } else if (_agent.length() > 7) {
        //
        //            if (_agent.substring(1, 7).equals("DuneHD")) {
        //                agentDevice = "DuneHD";
        //                System.out.println("A_" + agentDevice);
        //            }
        //
        //        } else {
        //            agentDevice = "android";
        //        }
        //            if (agentDevice.equals("other1")) {
        //                
        //                agentDevice = "android";
        //                System.out.println("E" + agentDevice);
        ////                
        ////            }
        //    }
        //
        //    System.out.println (
        //
        //    "BR:" + agentType);
        //    System.out.println (
        //
        //    "DV:" + agentDevice);
        //    System.out.println (
        //
        //"OS:" + agentOS);
        ////        Browser browser = Browser.parseUserAgentString("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_3; en-us) AppleWebKit/531.21.11 (KHTML, like");
        //        UserAgent userAgent = UserAgent.parseUserAgentString(sAgent);
        //
        //        System.out.println(userAgent.getBrowser());
        //        System.out.println(userAgent.getBrowserVersion());
        //        System.out.println(userAgent.getOperatingSystem());
        //
        ////
        //        Parser uaParser = new Parser();
        //        ClientUA c = uaParser.parse(sAgent);
        //        Device cd = uaParser.parseDevice(sAgent);
        //        OS co = uaParser.parseOS(sAgent);
        //        ua_parser.UserAgent cu = uaParser.parseUserAgent(sAgent);
        //
        //        System.out.println(c.toString()); // user-agent
        //        System.out.println(cd.toString()); // device
        //        System.out.println(co.toString()); // os
        //        System.out.println(cu.toString()); // browser
        //        System.out.println(c.userAgent.toString()); // => "Mobile Safari"
        //        System.out.println(c.userAgent.family); // => "Mobile Safari"
        //        System.out.println(c.userAgent.major);  // => "5"
        //        System.out.println(c.userAgent.minor);  // => "1"
        //
        //        System.out.println(c.os.family);        // => "iOS"
        //        System.out.println(c.os.major);         // => "5"
        //        System.out.println(c.os.minor);         // => "1"
        //
        //        System.out.println(c.device.family);    // => "iPhone"
        //         String uaString = "Mozilla/5.0 (iPhone; CPU iPhone OS 5_1_1 like Mac OS X) AppleWebKit/534.46 (KHTML, like Gecko) Version/5.1 Mobile/9B206 Safari/7534.48.3";
        //    String uaString = "(DuneHD/1.0 (product_id: hdtv_301; firmware_version: 150227_0032_b9)";
        //    String uaString = "stagefright/1.2 (Linux;Android 4.1.2)";
        //
        //  Parser uaParser = new Parser();
        //  ClientUA c = uaParser.parse(uaString);
        //
        //  System.out.println(c.userAgent.family); // => "Mobile Safari"
        //  System.out.println(c.userAgent.major);  // => "5"
        //  System.out.println(c.userAgent.minor);  // => "1"
        //
        //  System.out.println(c.os.family);        // => "iOS"
        //  System.out.println(c.os.major);         // => "5"
        //  System.out.println(c.os.minor);         // => "1"
        //
        //  System.out.println(c.device.family);    // => "iPhone"
        //        UserAgent a = new UserAgent(uaString);
        //        String sAgent = "AppleCoreMedia/1.0.0.11D257 (iPad; U; CPU OS 7_1_2 like Mac OS X; vi_vn)";
        //        String sAgent = "Mozilla/5.0 (Linux; U; Android 4.1.2; vi-vn; LG-F180 Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30 [FB_IAB/FB4A;FBAV/34.0.0.0.82;]";
        //        String sAgent = "Mozilla/5.0 Gecko/20100115 Firefox/3.6";
        //        String sAgent = "Mozilla/5.0 Gecko/20100115 Firefox/3.6";
        //        String sAgent = "Mozilla/5.0 (Linux; U; Android 4.0.3; en-us; HTC_PH39100/3.26.502.56 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";
        //        String sAgent = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36";
        ////        String sAgent = "Mozilla/5.0 (Windows NT 5.1; rv:37.0) Gecko/20100101 Firefox/37.0";
        //        String sAgent = "LG-V400/V10d Player/LG Player 1.0 for Android 4.4.2 (stagefright alternative)";
        //        String sAgent = "(DuneHD/1.0 (product_id: hdtv_301; firmware_version: 150227_0032_b9)";
        //        String sAgent = "Mozilla/5.0 (compatible; MSIE 9.0; Windows Phone OS 7.5; Trident/5.0; IEMobile/9.0)";
        //        String sAgent = "Windows Phone Search (Windows Phone OS 7.10;NOKIA;Lumia 900;7.10;8862)";
        //        String sAgent = "Mozilla/5.0 (BlackBerry; U; BlackBerry 9900; fr) AppleWebKit/534.11+ (KHTML, like Gecko) Version/7.0.0.296 Mobile Safari/534.11+";
        //        String sAgent = "Mozilla/5.0 (SymbianOS/9.4; Series60/5.0 NokiaX6-00/20.0.005; Profile/MIDP-2.1 Configuration/CLDC-1.1 ) AppleWebKit/525 (KHTML, like Gecko) Version/3.0 BrowserNG/7.2.3";
        //        String sAgent = "Mozilla/5.0 (Series40; NokiaX3-02/le6.32; Profile/MIDP-2.1 Configuration/CLDC-1.1) Gecko/20100401 S40OviBrowser/2.0.2.62.10";
        //        String sAgent = "(Linux armv7l ; U; HbbTV/1.1.1 (; TOSHIBA; 32SL863; 19.2.39.208; 3; ) ; ToshibaTP/1.1.1 () ; en)";
        //        String sAgent = "Mozilla/5.0 (Linux; Android 4.4.2; l5450 Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Safari/537.36";
        //        String sAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.5.17 (KHTML, like Gecko) Version/7.1.5 Safari/537.85.14";
        //        String sAgent = "stagefright/1.2 (Linux;Android 4.1.2)";
        //        String sAgent = "Mozilla/5.0 (iPod; U; CPU iPhone OS 4_1 like Mac OS X; es-es) AppleWebKit/532.9 (KHTML, like Gecko) Mobile/8B118";
        //        String sAgent = "Mozilla/5.0 (Windows; U; Windows NT 6.0; es-AR; rv:1.8.1.7) Gecko/20070914 Firefox/2.0.0.7";
        //-------------------------------------------------
        //    
        //        String _agent = sAgent;
        //        String agentType = "other";
        //        String agentDevice = "other";
        //        String agentOS = "other";
        //
        //        UserAgentDetector userAgentDetector = new UserAgentDetector();
        //        UserAgentDetectionResult parseUserAgent = userAgentDetector.parseUserAgent(_agent);
        //
        //        agentOS = parseUserAgent.getOperatingSystem().family.toString() + " "
        //                + parseUserAgent.getOperatingSystem().version.toString();
        //        agentType = parseUserAgent.getBrowser().family.toString() + " "
        //                + parseUserAgent.getBrowser().version.toString();
        //
        //        if (parseUserAgent.getDevice().deviceType.toString().equals("COMPUTER")) {
        //
        //            agentDevice = "pc";
        //
        //        } else if (parseUserAgent.getDevice().device.toString().contains("iPad")) {
        //
        //            agentDevice = "ipad";
        //
        //        } else if (parseUserAgent.getDevice().device.toString().contains("iPhone")
        //                || parseUserAgent.getDevice().device.toString().contains("iPod")) {
        //
        //            agentDevice = "iphone";
        //
        //        } else if (_agent.contains("DuneHD")) {
        //
        //            agentDevice = "dunehd";
        //
        //        } else if (parseUserAgent.getOperatingSystem().family.toString().equals("ANDROID")) {
        //
        //            agentDevice = "android";
        //
        //        } else {
        //
        //            agentDevice = "android";
        //
        //        }
        //        System.out.println("agentType: " + agentType);
        //        System.out.println("agentDevice: " + agentDevice);
        //        System.out.println("agentOS: " + agentOS);
        //
        //        HashMap<Integer, String> hashMapAgent = new HashMap<>();
        //        hashMapAgent.put(1, agentType);
        //        hashMapAgent.put(2, agentDevice);
        //        hashMapAgent.put(3, agentOS);
        //--------------------------------------------------------
        //        System.out.println(parseUserAgent.getDevice().device);
        //        System.out.println(parseUserAgent.getDevice().deviceType);
        //        System.out.println(parseUserAgent.getDevice().brand);
        //        System.out.println(parseUserAgent.getDevice().architecture);
        //        System.out.println(parseUserAgent.getDevice().manufacturer);
        ////
        //        System.out.println(parseUserAgent.getOperatingSystem().family);
        //        System.out.println(parseUserAgent.getOperatingSystem().description);
        //        System.out.println(parseUserAgent.getOperatingSystem().vendor);
        //        System.out.println(parseUserAgent.getOperatingSystem().version);
    }

//    private static final String POST_URL = "http://hdvietv3.cloudapp.net/api/authentication/profile";
//    private static final String POST_PARAMS = "access_token=a88bb06601164d04b9da8de7ced5cd38";
//    private static final String POST_PARAMS = "access_token=e9cad54a3c3047519dfaa45c0f6b98b0";
//    public static String sHashMap(String sMap, String sVal) {
//        if (sMap.equals("hinfo")) {
//            String sinfo = "hot";
//            HashMap<String, String> hinfo = new HashMap<>();
//            hinfo.put("cvdcw3.vn-hd.com", "cool");
//            hinfo.put("cvtw3.vn-hd.com", "cool");
//            hinfo.put("cfptw3.vn-hd.com", "cool");
//            hinfo.put("cvdcw3-vip.vn-hd.com", "cool");
//            hinfo.put("cvtw3-vip.vn-hd.com", "cool");
//            hinfo.put("cfptw3-vip.vn-hd.com", "cool");
//
//            hinfo.put("vdcw3.vn-hd.com", "warm");
//            hinfo.put("vtw3.vn-hd.com", "warm");
//            hinfo.put("fptw3.vn-hd.com", "warm");
//            hinfo.put("vdcw3-vip.vn-hd.com", "warm");
//            hinfo.put("vtw3-vip.vn-hd.com", "warm");
//            hinfo.put("fptw3-vip.vn-hd.com", "warm");
//
//            if (hinfo.containsKey(sVal)) {
//                sinfo = hinfo.get(sVal);
//            }
//            return sinfo;
//        }
////        String sCon = "";
//        if (sMap.equals("hProfile")) {
//            String profile = "";
//            HashMap<String, String> profileMap = new HashMap<>();
////            New profile
//            profileMap.put("350000", "180p");
//            profileMap.put("500000", "270p");
//            profileMap.put("800000", "360p");
//            profileMap.put("1300000", "450p");
//            profileMap.put("1800000", "576p");
//            profileMap.put("2500000", "720p+");
//            profileMap.put("3500000", "1008p");
//            profileMap.put("5500000", "1080p+");
////            Old profile
//            profileMap.put("700000", "270p");
//            profileMap.put("1000000", "360p");
//            profileMap.put("1500000", "450p");
//            profileMap.put("2000000", "576p");
//            profileMap.put("2700000", "720p+");
//            profileMap.put("5700000", "1080p");
//            if (profileMap.containsKey(sVal)) {
//                profile = profileMap.get(sVal);
//            }
//            return profile;
//        }
//        if (sMap.equals("hISP")) {
//            String ISP = "Other";
//            HashMap<String, String> hISP = new HashMap<>();
//            hISP.put("FPT Telecom", "fpt");
//            hISP.put("FPT Telecom Company", "fpt");
//            hISP.put("Corporation for Financing and Promoting Technology", "fpt");
//            hISP.put("The Corporation for Financing and Promoting Techno", "fpt");
//            hISP.put("fpt", "fpt");
//            hISP.put("Dai IP dong su dung cho ket noi xDSL", "fpt");
//            hISP.put("VDC", "vnpt");
//            hISP.put("Vietnam Posts and Telecommunications Corp (VNPT)", "vnpt");
//            hISP.put("Vietnam Posts and Telecommunications (VNPT)", "vnpt");
//            hISP.put("Viettel Corporation", "viettel");
//            hISP.put("SaiGon Tourist Cable Television", "SCTV");
//            hISP.put("Cty co phan ha tang vien thong CMC", "CMC");
//            hISP.put("CMC Telecom Infrastructure Company", "CMC");
//            hISP.put("Sai gon Postel Corporation", "SPT");
//            if (hISP.containsKey(sVal)) {
//                ISP = hISP.get(sVal);
//            }
//            return ISP;
//        }
//        return null;
//    }
//
////    private static final SimpleDateFormat minuteFormatter = new SimpleDateFormat("yyyyMMddHHmm");
////    private static final SimpleDateFormat secondFormatter = new SimpleDateFormat("yyyyMMddHHmmss");
////
////    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
////    private static final SimpleDateFormat _minuteFormatter = new SimpleDateFormat("yyyyMMddHHmm");
////    private static final SimpleDateFormat _hourFormatter = new SimpleDateFormat("yyyyMMddHH");
////
////    private static 
//    public static class TokenFormat {
//
//        String message;
//        String error;
//    }
//
//    public static class TokenLoginFormat {
//
//        String message;
//        DataTokenFormat data;
//        String error;
//    }
//
//    public static class DataTokenFormat {
//
//        String joined_date;
//        String user_id;
//        String end_date;
//        String access_token;
//        String gender;
//        String email;
//        String phone;
//        String vip;
//        String birthday;
//        String last_login;
//        String avatar;
//        String anonymous;
//        String address;
//        String uu_code;
//        String vip_day;
//        String display_name;
//
//    }
//    private static HashMap<Integer, String> CheckCAS(String param, int strCheck) {
//
//        String POST_URL = "http://hdvietv3.cloudapp.net/api/authentication/profile";
//        String POST_PARAMS = "access_token=" + param;
//        HashMap<Integer, String> hashMapCAS = new HashMap<>();
//
//        try {
//            URL obj = new URL(POST_URL);
//
//            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//            con.setRequestMethod("POST");
//
//            // For POST only - START
//            con.setDoOutput(true);
//            OutputStream os = con.getOutputStream();
//            os.write(POST_PARAMS.getBytes());
//            os.flush();
//            os.close();
//            // For POST only - END
//
//            int responseCode = con.getResponseCode();
//            Gson gson = new Gson();
//            if (responseCode == HttpURLConnection.HTTP_OK) { //success
//
//                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//                String response = in.readLine();
//                in.close();
//
//                TokenFormat dataToken = gson.fromJson(response, TokenFormat.class);
//                if ("0".equals(dataToken.error)) {
//                    TokenLoginFormat dataTokenSuccess = gson.fromJson(response, TokenLoginFormat.class);
//
//                    if (strCheck == 1) {
//
//                        if (dataTokenSuccess.data.anonymous.equals("true")) {// is anonymous
//                            hashMapCAS.put(1, "no_login");
//                            hashMapCAS.put(2, "anonymous");
//                        } else {
//                            hashMapCAS.put(1, "login");
//                            if (dataTokenSuccess.data.vip.equals("true")) {// is vip
//                                hashMapCAS.put(2, "vip");
//
//                            } else {
//                                hashMapCAS.put(2, "free");
//                            }
//                        }
//
//                    }
//
//                } else {
//                    hashMapCAS.put(1, "atf");
//                    hashMapCAS.put(2, "atf");
////                    LOG.info("CheckCAS_ERROR_99");
//
//                }
//            } else {
////                LOG.info("CheckCAS_NOT_HTTP_OK");
//                hashMapCAS.put(1, "atf");
//                hashMapCAS.put(2, "atf");
//            }
//
//        } catch (IOException ex) {
//
////            LOG.info("CheckCAS_IOException: "+ex); 
//            POST_URL = null;
//            POST_PARAMS = null;
//
//            hashMapCAS.put(0, "atf");
//            hashMapCAS.put(1, "atf");
//
//        }
//        return hashMapCAS;
//    }
//
//    public void run() {
//
//        String csvFile = "/home/soh-l/Downloads/table.csv";
//        BufferedReader br = null;
//        String line = "";
//        String cvsSplitBy = ",";
//
//        try {
//
//            br = new BufferedReader(new FileReader(csvFile));
//            while ((line = br.readLine()) != null) {
//
//                // use comma as separator
//                String[] country = line.split(cvsSplitBy);
//
//                System.out.println("Country [code= " + country[0]
//                                    + " , name=" + country[1] + "]");
//
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        System.out.println("Done");
//    }
//    private static final SimpleDateFormat _minuteFormatter = new SimpleDateFormat("yyyyMMddHHmm");
//    private static final SimpleDateFormat _hourFormatter = new SimpleDateFormat("yyyyMMddHH");
//    private static final SimpleDateFormat _dayFormatter = new SimpleDateFormat("yyyyMMdd");
//    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
}

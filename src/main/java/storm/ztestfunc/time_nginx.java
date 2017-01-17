/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 *
 * @author soh-l
 */
public class time_nginx {

    public static final SimpleDateFormat minuteFormatter = new SimpleDateFormat("yyyyMMddHHmm");
    public static final SimpleDateFormat hourFormatter = new SimpleDateFormat("yyyyMMddHH");
    public static final SimpleDateFormat dayFormatter = new SimpleDateFormat("yyyyMMdd");
    public static final SimpleDateFormat dateFormatUTC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    public static final SimpleDateFormat dateFormatNGINX = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss");

    public static void time_nginx(String time) {
        /*  Process on t*/
        
      
        
        Date dateLog = null;
        dateLog = new Date();

        minuteFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        hourFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        dayFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));

        String sMinuteFormatter = minuteFormatter.format(dateLog);
        String sHourFormatter = hourFormatter.format(dateLog);
        String sDayFormatter = dayFormatter.format(dateLog);

        System.out.println("dau tien");
        System.out.println("min: " + minuteFormatter.format(dateLog));
        System.out.println("hour: " + hourFormatter.format(dateLog));
        System.out.println("day: " + dayFormatter.format(dateLog));

        minuteFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        hourFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        dayFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println("dau tien2");
        System.out.println("min: " + minuteFormatter.format(dateLog));
        System.out.println("hour: " + hourFormatter.format(dateLog));
        System.out.println("day: " + dayFormatter.format(dateLog));

        try {
            dateLog = dateFormatNGINX.parse(time);
            System.out.println(dateLog);
//            LOG.info("Time parse: " + dateLog.toString());
        } catch (ParseException ex) {
//            LOG.info("LogAggregateBolt_ParseException: " + ex);
            System.out.println("exp");

//            DateTime dateLog = DateTime.now(DateTimeZone.UTC);
            dateLog = new Date();
            System.out.println(dateLog);

//            System.out.println("truoc");
//            System.out.println("min: " + minuteFormatter.format(dateLog));
//            System.out.println("hour: " + hourFormatter.format(dateLog));
//            System.out.println("day: " + dayFormatter.format(dateLog));
//
//            minuteFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
//            hourFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
//            dayFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
//            System.out.println("sau");
//            System.out.println("min: " + minuteFormatter.format(dateLog));
//            System.out.println("hour: " + hourFormatter.format(dateLog));
//            System.out.println("day: " + dayFormatter.format(dateLog));
//            LOG.info("Time ex: " + dateLog);
        }

        minuteFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        hourFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        dayFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println("sau nua");
        System.out.println("min: " + minuteFormatter.format(dateLog));
        System.out.println("hour: " + hourFormatter.format(dateLog));
        System.out.println("day: " + dayFormatter.format(dateLog));

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author soh-l
 */
public class timeonsite {

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static long checkTime(String firsttime, String ontime) {

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = dateFormat.parse(firsttime);
            d2 = dateFormat.parse(ontime);

//            long diff = d2.getTime() - d1.getTime();//it is miliseconds
//            long tmp = (diff / 1000) / 60;
            long diff = ((d2.getTime() - d1.getTime()) / 1000) / 60;

            return diff;

        } catch (Exception e) {
//            LOG.info("");
            return 0;
        }
    }
}

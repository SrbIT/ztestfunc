/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soh-l
 */
public class notsuredate {

    public static int GetLastDayOfMonth(String register_time) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date getDayRedis = dateFormat.parse(register_time);

            Calendar calendar1 = Calendar.getInstance();// calendar1 
            calendar1.setTime(getDayRedis);

            calendar1.add(Calendar.MONTH, 1);
            calendar1.set(Calendar.DAY_OF_MONTH, 1);
            calendar1.add(Calendar.DATE, -1);

            Date lastDayOfMonth = calendar1.getTime();

            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(lastDayOfMonth);
            System.out.println("Last:" + calendar2.get(Calendar.DAY_OF_MONTH));

            return calendar2.get(Calendar.DAY_OF_MONTH);
        } catch (ParseException ex) {
            Logger.getLogger(notsuredate.class.getName()).log(Level.SEVERE, null, ex);
//            LOG.info("GetLastDay_ParseException: "+ex);
        }
        return 0;

    }

    public static int CampareNotSureDay(String register_time, String login_time) {//Over da
        try {

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

            Date getDayRedis = dateFormat.parse(register_time);
            Date getNewDay = dateFormat.parse(login_time);

            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(getDayRedis);
            cal2.setTime(getNewDay);

            int year1 = cal1.get(Calendar.YEAR);
            int month1 = cal1.get(Calendar.MONTH) + 1;
            int day1 = cal1.get(Calendar.DAY_OF_MONTH);

            int year2 = cal2.get(Calendar.YEAR);
            int month2 = cal2.get(Calendar.MONTH) + 1;
            int day2 = cal2.get(Calendar.DAY_OF_MONTH);

            System.out.println("Date_1: " + year1 + month1 + day1);
            System.out.println("Date_2: " + year2 + month2 + day2);

            Calendar cTmp = Calendar.getInstance();
            cTmp.setTime(getDayRedis);// Time register

            for (int i = 0; i <15; i++) {

                if (i == 0) {
                    cTmp.add(Calendar.DATE, 0);// Khong tang vi moi dang nhap
                } else {
                    cTmp.add(Calendar.DATE, 1);// Moi lan tang 1 lan vi ngai cu con luu
                }
                if (cTmp.get(Calendar.YEAR) == year2) {
                    if (cTmp.get(Calendar.MONTH) + 1 == month2) {
                        if (cTmp.get(Calendar.DAY_OF_MONTH) == day2) {
                            System.out.println(i);
                            System.out.println("Date (after): " + (cTmp.get(Calendar.MONTH) + 1)
                                                + "-" + cTmp.get(Calendar.DATE) + "-" + cTmp.get(Calendar.YEAR));
                            return i + 1;
                        }
                    }

                }

            }

        } catch (ParseException ex) {
//            LOG.error("Gadget_CampareDa_CampareDa: " + ex);
            System.out.println("Gadget_CampareDa_CampareDa: " + ex);
        }
        return -1;
    }

}

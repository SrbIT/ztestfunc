/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author soh-l
 */
public class parse_audioindex {

    public static int indexiT(String _request, int flag) {
        int iT = 0;
        if (flag == 0) {
            if (_request.contains("audioindex")) {
                if (_request.contains("_TM")) {
                    iT = 11;

                } else if (_request.contains("_AC3")) {
                    iT = 12;

                }
            } else {
                iT = 8;

            }
        } else {

            if (_request.contains("audioindex")) {
                if (_request.contains("_TM")) {
                    iT = 6;

                } else if (_request.contains("_AC3")) {
                    iT = 7;

                }
            } else {
                iT = 3;

            }

        }
        return iT;
    }

    public static String audio(String _request) {
        int iT = 3;
        String strMovieID = null;
        String sPattern1 = "il:[^\\t]+.sm";// To parse movieID
        String sPattern2 = "\\/E\\d*\\/";// To parse eposide

        Pattern pPattern1 = Pattern.compile(sPattern1);
        Pattern pPattern2 = Pattern.compile(sPattern2);

        Matcher m1 = pPattern1.matcher(_request);
        Matcher m2 = pPattern2.matcher(_request);

        if (m2.find()) {
            iT = indexiT(_request, 0);// bo

        }

        if (m1.find()) {
            if (iT == 3) {
                iT = indexiT(_request, 1);//le
            }
            String sResult = m1.group(0);
            strMovieID = "MovieID4:" + sResult.substring(3, sResult.length() - iT).replaceAll(sPattern2, "/xxx/");

        }

        return strMovieID;

    }

}

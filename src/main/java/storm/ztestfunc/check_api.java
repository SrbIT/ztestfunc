/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/**
 *
 * @author soh-l
 */
public class check_api {

    public static class DataFormat {

        String code;
        ResultFormat result;
    }

    public static class CodeFormat {

        String code;
//        ResultFormat result;
    }

    public static class ResultFormat {

        String key;
        String userInfo;
    }

    public static class DataCMFormat {

        String code;
        ValueCMFormat value;
    }

    public static class ValueCMFormat {

        String movieid;
        String title;
        String knownAs;
        String episode;
        String category;
        String priceType;

    }

    public static HashMap<Integer, String> APICM(String accessToken, String location) {
//    public static void CheckCAS(String accessToken, String location) {
//http://118.69.169.229:1337/movie/cm?accessToken=ajmldccfpln2016&location=2/4faf5d6b5b83ba0afad69e8e2e1b3853
//        String POST_URL = "http://118.69.169.229:1337/media/md";
//        String POST_URL = "http://118.69.169.229:1337/movie/cm";
//        String POST_URL = "http://r1:1337/movie/cm";
        String POST_URL = "http://localhost:1337/movie/cm";
        String POST_PARAMS = "accessToken=" + accessToken + "&location=" + location;
        HashMap<Integer, String> hashMapCM = new HashMap<>();

        try {
            URL obj = new URL(POST_URL);

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");

            // For POST only - START
            con.setDoOutput(true);
            OutputStream os = con.getOutputStream();
            os.write(POST_PARAMS.getBytes());
            os.flush();
            os.close();
            // For POST only - END

            int responseCode = con.getResponseCode();
            System.out.println("responseCode" + responseCode);
            Gson gson = new Gson();
            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String response = in.readLine();
                in.close();

                DataCMFormat dataCM = gson.fromJson(response, DataCMFormat.class);
                System.out.println("dataCM.code: " + dataCM.code);
                System.out.println("dataCM.value.movieid: " + dataCM.value.movieid);
                System.out.println("dataCM.value.title: " + dataCM.value.title);
                System.out.println("dataCM.value.knownAs: " + dataCM.value.knownAs);
                System.out.println("dataCM.value.episode: " + dataCM.value.episode);
                System.out.println("dataCM.value.category: " + dataCM.value.category);
                System.out.println("dataCM.value.type: " + dataCM.value.priceType);

                if ("0".equals(dataCM.code)) {

                    //                                    LOG.info("CheckDataCM.code=0");
                    hashMapCM.put(1, dataCM.value.movieid.replace("-", ""));
                    hashMapCM.put(2, dataCM.value.title);
                    hashMapCM.put(3, dataCM.value.episode);
                    hashMapCM.put(4, dataCM.value.category);
                    hashMapCM.put(5, dataCM.value.priceType);

                } else {

                    System.out.println("CheckDataCM.code=1");
//                                    LOG.info("CheckDataCM.code=1");

                    hashMapCM.put(1, "other");
                    hashMapCM.put(2, "other");
                    hashMapCM.put(3, "other");
                    hashMapCM.put(4, "other");
                    hashMapCM.put(5, "other");

                }
            } else {
//                LOG.info("CheckDataCM_NOT_HTTP_OK");
                System.out.println("CheckDataCM_NOT_HTTP_OK");

                hashMapCM.put(1, "other");
                hashMapCM.put(2, "other");
                hashMapCM.put(3, "other");
                hashMapCM.put(4, "other");
                hashMapCM.put(5, "other");
            }

        } catch (IOException ex) {
            System.out.println("CheckDataCM_IOException");

//            LOG.info("CheckDataCM_IOException: "+ex); 
            POST_URL = null;
            POST_PARAMS = null;

            hashMapCM.put(1, "other");
            hashMapCM.put(2, "other");
            hashMapCM.put(3, "other");
            hashMapCM.put(4, "other");
            hashMapCM.put(5, "other");

        }
        return hashMapCM;
    }
}

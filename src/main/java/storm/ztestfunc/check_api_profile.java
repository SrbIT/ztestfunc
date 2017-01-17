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
public class check_api_profile {

    public static class DataMDFormat {

        String code;
        ValueMDFormat value;
    }

    public static class ValueMDFormat {

        public String movieid;
        public String bandwidth;
        public String width;
        public String height;
        public String profile_prefix;
        public String present_id;
        public String location;

    }

    
    
    public static HashMap<Integer, String> APIMD(String accessToken, String location, String profile) {
//    public static void CheckCAS(String accessToken, String location) {
//http://118.69.169.229:1337/movie/cm?accessToken=ajmldccfpln2016&location=2/4faf5d6b5b83ba0afad69e8e2e1b3853
        String POST_URL = "http://118.69.169.229:1337/media/md";
        String POST_PARAMS = "accessToken=" + accessToken + "&location=" + location + "&profile=" + profile;
        HashMap<Integer, String> hashMapMD = new HashMap<>();

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

                DataMDFormat dataMD = gson.fromJson(response, DataMDFormat.class);
                System.out.println("dataMD.code" + dataMD.code);
                System.out.println("dataMD.value.movieid" + dataMD.value.movieid);
                System.out.println("dataMD.value.bandwidth" + dataMD.value.bandwidth);
                System.out.println("dataMD.value.width" + dataMD.value.width);
                System.out.println("dataMD.value.height" + dataMD.value.height);
                System.out.println("dataMD.value.profile_prefix" + dataMD.value.profile_prefix);
                System.out.println("dataMD.value.present_id" + dataMD.value.present_id);
                System.out.println("dataMD.value.location" + dataMD.value.location);

                if ("0".equals(dataMD.code)) {

                    //                                    LOG.info("CheckDataMD.code=0");
                    hashMapMD.put(1, dataMD.value.bandwidth);
                    hashMapMD.put(2, dataMD.value.profile_prefix);

                } else {

                    System.out.println("CheckDataCM.code=1");
//                                    LOG.info("CheckDataMD.code=1");

                    hashMapMD.put(1, "other");
                    hashMapMD.put(2, "other");
                }
            } else {
//                LOG.info("CheckDataMD_NOT_HTTP_OK");
                System.out.println("CheckDataCM_NOT_HTTP_OK");

                hashMapMD.put(1, "other");
                hashMapMD.put(2, "other");
            }

        } catch (IOException ex) {
            System.out.println("CheckDataCM_IOException");

//            LOG.info("CheckDataMD_IOException: "+ex); 
            POST_URL = null;
            POST_PARAMS = null;

            hashMapMD.put(1, "other");
            hashMapMD.put(2, "other");

        }
        return hashMapMD;
    }
    
    
    
}

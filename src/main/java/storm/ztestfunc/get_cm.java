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
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import static storm.kafka.DynamicPartitionConnections.LOG;

/**
 *
 * @author soh-l
 */
public class get_cm {

    public class UserFormat {

        UserInfoFormat userInfo;
    }

    public class UserInfoFormat {

        public String id;
    }

    public static class CMBillFormat {

        String code;
        ResultCMBillFormat result;
    }

    public static class CASPayFormat {

        String code;
        ResultCASPayFormat result;
    }

    public static class CodeFormat {

        String code;
    }

    public static class ResultCASPayFormat {

        String key;
        String userInfo;
    }

    public static class ResultCMBillFormat {

        String token;
        String userInfo;
    }

    public static HashMap<Integer, String> API_DB(String service, String token) {

        String GET_URL = "http://localhost:9000/" + service + "/" + token;
//        String GET_URL = "http://lj2:9000/" + service + "/" + token;
        System.out.println(GET_URL);

        HashMap<Integer, String> hashMapDB = new HashMap<>();

        try {

            URL obj = new URL(GET_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            LOG.info("responseCode" + responseCode);
            Gson gson = new Gson();
            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String response = in.readLine();
                in.close();

                System.out.println(response);
                CodeFormat Code = gson.fromJson(response, CodeFormat.class);
                LOG.info("dataDB.code:" + Code.code);

                if ("0".equals(Code.code)) {
                    if (service.equals("cm") || service.equals("bill")) {
                        //token is bill vs cm
                        CMBillFormat dataDB = gson.fromJson(response, CMBillFormat.class);
                        UserInfoFormat dbUser = gson.fromJson(dataDB.result.userInfo, UserInfoFormat.class);
                        LOG.info("dataDB.result:" + dataDB.result.token.toString());
                        LOG.info("dataDB.result:" + dataDB.result.userInfo);
                        LOG.info("dataDB.result:" + dbUser.id);

                        hashMapDB.put(1, dbUser.id);
                    } else if (service.equals("pay")) {
                        //key pay
                        CASPayFormat dataDB = gson.fromJson(response, CASPayFormat.class);
                        UserFormat dbUser = gson.fromJson(dataDB.result.userInfo, UserFormat.class);
                        LOG.info("dataDB.result:" + dataDB.result.key.toString());
                        LOG.info("dataDB.result:" + dataDB.result.userInfo);
                        LOG.info("dataDB.result:" + dbUser.userInfo.id);
                        hashMapDB.put(1, dbUser.userInfo.id);
                    } else {
                        //key cas
                        CASPayFormat dataDB = gson.fromJson(response, CASPayFormat.class);
                        UserInfoFormat dbUser = gson.fromJson(dataDB.result.userInfo, UserInfoFormat.class);
                        LOG.info("dataDB.result:" + dataDB.result.key.toString());
                        LOG.info("dataDB.result:" + dataDB.result.userInfo);
                        LOG.info("dataDB.result:" + dbUser.id);
                        hashMapDB.put(1, dbUser.id);
                    }

                } else {
                    LOG.info("dataDB.result is NOT:");
                    hashMapDB.put(1, "-");
                }
            } else {
                LOG.info("CheckDataCM_NOT_HTTP_OK");
                hashMapDB.put(1, "-");
            }
        } catch (IOException ex) {
            LOG.info("CheckDataCM_IOException: " + ex);
            hashMapDB.put(1, "-");
        }
        return hashMapDB;
    }

}

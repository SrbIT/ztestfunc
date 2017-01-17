/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import cz.mallat.uasparser.OnlineUpdater;
import cz.mallat.uasparser.UASparser;
import cz.mallat.uasparser.UserAgentInfo;
import java.util.HashMap;
import net.pieroxy.ua.detection.UserAgentDetectionResult;
import net.pieroxy.ua.detection.UserAgentDetector;

/**
 *
 * @author soh-l
 */
public class check_agent {

    public static HashMap<Integer, String> HashMapAgent(String agentS) {

        String agentType = "other";
        String agentDevice = "other";
        String agentOS = "other";

        try {

            UASparser parser = new UASparser(OnlineUpdater.getVendoredInputStream());
            UserAgentInfo info = parser.parse(agentS);

            if (info.getDeviceType().equals("Smart TV")) {
                agentDevice = "smart_tv";
                agentType = info.getUaName();
                agentOS = info.getOsName();
            } else {

                UserAgentDetector userAgentDetector = new UserAgentDetector();
                UserAgentDetectionResult parseUserAgent = userAgentDetector.parseUserAgent(agentS);

                agentOS = parseUserAgent.getOperatingSystem().family.toString() + " "
                                    + parseUserAgent.getOperatingSystem().version.toString();
                agentType = parseUserAgent.getBrowser().family.toString() + " "
                                    + parseUserAgent.getBrowser().version.toString();
                System.out.println(parseUserAgent.getDevice().deviceType.toString());

                if (parseUserAgent.getDevice().deviceType.toString().equals("COMPUTER")) {

                    agentDevice = "pc";

                } else if (parseUserAgent.getDevice().device.toString().contains("iPad")) {

                    agentDevice = "ipad";

                } else if (parseUserAgent.getDevice().device.toString().contains("iPhone")) {

                    agentDevice = "iphone";

                } else if (parseUserAgent.getOperatingSystem().family.toString().equals("ANDROID")) {

                    agentDevice = "android";

                } else {
                    if (agentS.contains("Apple TV")) {
                        agentDevice = "apple_tv";

                    } else if (agentS.contains("samsungsmooth") || agentS.contains("smooth")||agentS.contains("SmartTV")) {
                        agentDevice = "smart_tv";

                    } else if (agentS.contains("castLabs")) {
                        agentDevice = "android";
                    } else {
                        agentDevice = "unknown";
                    }

                }
            }

        } catch (Exception e) {

//            LOG.info("GadgetBolt_HashMapAgent_Exception:", e);
            agentType = "unknown";
            agentDevice = "unknown";
            agentOS = "unknown";

        }

        if (agentType == null) {
            agentType = "soh";
        }
        if (agentDevice == null) {
            agentDevice = "soh";
        }
        if (agentOS == null) {
            agentOS = "soh";
        }

        HashMap<Integer, String> hashMapAgent = new HashMap<>();
        hashMapAgent.put(1, agentType);
        hashMapAgent.put(2, agentDevice);
        hashMapAgent.put(3, agentOS);

        return hashMapAgent;

    }
}

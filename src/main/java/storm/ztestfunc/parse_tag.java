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
public class parse_tag {

    public static String parseTag(String tag) {

        int flag = 0;
        String sPatternA = "asia|bangkok|Châu Á|China|Đài Loan|Indonesia|japan|japanese mafia|korea|korean war|Malaysia|Mông Cổ|Nhật|Nhật Bản|Singapore|south korea|thailand|Vietnam|trung quốc|hồng kông|hàn quốc|việt nam|thái lan|Ấn Độ|bagdad|china|Hàn Quốc|Hồng Kông|north korea|Philippines|seoul|Singapore|south korea|Thái Lan|Trung Quốc|Việt Nam|Vietnam|Cổ trang|Anime|Kiếm hiệp|Phim Việt Nam|Phim Trung Quốc|Phim Hàn Quốc|Phim Đài Loan|Phim Nhật Bản|Phim Hồng Kông|Phim Thái Lan|Phim Châu Á|Phim Ấn Độ|Phim Philippines";// To parse eposide
        String sPatternAuMy = "Australia|Bahamas|Ba Lan|Belarus|berlin|BỉBồ Đào Nha|Bolivia|Bosnia|Herzegovina|Botswana|Brazil|Bulgaria|Chile|Colombia|Cộng hòa Séc|Cuba|Cyprus|Czechoslovakia|Đan Mạch|Đức|Finland|Germany|Guatemala|Hà Lan|Hy Lạp|Iceland|Kazakhstan|Latvia|Lebanon|Libya|Liên Xô|london|Luxembourg|Macedonia|Mexico|Monaco|montreal|Morocco|Mỹ|Nam Phi|Na Uy|Nepal|new york|New Zealand|Nga|Norway|norwegian|Phần Lan|Pháp|Puerto Rico|Romania|Serbia|Serbia and Montenegro|Slovakia|Slovenia|Thụy Điển|Thụy Sĩ|Úc|United Kingdom|Uruguay|usa|âu mỹ|Phim Mỹ|Phim Châu Âu|Phim Pháp|Phim Anh|Phim Canada|Phim Đức|Phim Tây Ban Nha|Phim Ireland|Phim Hungary|Phim Nga|Phim Mexico|Phim Úc";
        Pattern patternA = Pattern.compile(sPatternA);
        Pattern patternAuMy = Pattern.compile(sPatternAuMy);
        Matcher matcherA = patternA.matcher(tag);
        Matcher matcherAuMy = patternAuMy.matcher(tag);

        if (matcherA.find()) {
            flag = 1;
        }
        if (matcherAuMy.find()) {
            flag = 2;
        }

        if (flag == 1) {
            return "á";
        } else if (flag == 2) {
            return "âu_mỹ";
        } else {
            return "other";
        }

    }

}

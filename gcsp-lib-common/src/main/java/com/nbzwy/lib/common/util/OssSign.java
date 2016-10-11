package com.nbzwy.lib.common.util;

import com.aliyun.oss.common.auth.HmacSHA1Signature;
import com.aliyun.oss.common.utils.HttpUtil;
import org.apache.log4j.Logger;

/**
 * Created by zt on 2016-05-28.
 */
public class OssSign {
    private static Logger logger = Logger.getLogger(OssSign.class);

    public static String SignHttpGetUrl(String keySecret,String bucket,String filename,int timeExpired) {
        String data = "";
        data = data + "GET" + "\n"; //VERB
        data = data + "" + "\n";    //CONTENT-MD5
        data = data + "" + "\n";    //CONTENT-TYPE
        data = data + timeExpired + "\n";    //EXPIRES
        data = data + "/" + bucket + "/" + filename;

        HmacSHA1Signature hmacSHA1Signature = new HmacSHA1Signature();
        String shaStr = hmacSHA1Signature.computeSignature(keySecret, data);
        return HttpUtil.urlEncode(shaStr, "utf-8");
    }
}

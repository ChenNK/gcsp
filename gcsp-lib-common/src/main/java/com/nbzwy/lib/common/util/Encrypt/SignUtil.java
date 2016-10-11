package com.nbzwy.lib.common.util.Encrypt;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * SignUtil class
 *
 * 计算平台的消息签名接口.
 */
public class SignUtil {

    /**
     * 用SHA1算法生成安全签名
     * @param appSecret 密钥
     * @param timestamp 时间戳
     * @param encrypt 密文
     * @return 安全签名
     * @throws AesException
     */
    public static String getSign(String appSecret, String timestamp, String encrypt) throws AesException
    {
        try {
            String[] array = new String[] { appSecret, timestamp, encrypt };
            StringBuffer sb = new StringBuffer();
            // 字符串排序
            Arrays.sort(array);
            for (int i = 0; i < 3; i++) {
                sb.append(array[i]);
            }
            String str = sb.toString();
            // SHA1签名生成
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(str.getBytes());
            byte[] digest = md.digest();

            StringBuffer hexstr = new StringBuffer();
            String shaHex = "";
            for (int i = 0; i < digest.length; i++) {
                shaHex = Integer.toHexString(digest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexstr.append(0);
                }
                hexstr.append(shaHex);
            }
            return hexstr.toString();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AesException(AesException.ComputeSignatureError);
        }
    }
}
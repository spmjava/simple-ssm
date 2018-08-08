package com.spmjava.utils;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/**
 * @author 齐伟超
 * @date 2018-01-08 16:36
 * @since 1.0.0
 **/
public class SecurityUtil {

    /**
     * MD5加密
     * @param str
     * @return
     */
    public static String MD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes("UTF-8"));
            byte[] digest = md5.digest();
            StringBuffer hexString = new StringBuffer();
            String strTemp;
            for (int i = 0; i < digest.length; i++) {
                strTemp = Integer.toHexString((digest[i] & 0x000000FF) | 0xFFFFFF00).substring(6);
                hexString.append(strTemp);
            }
            return hexString.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * Base64加密
     * @param str
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String Base64Encode(String str) throws UnsupportedEncodingException {
        //return new BASE64Encoder().encode(str.getBytes("UTF-8"));
        return null;
    }

    /**
     * Base64解密
     * @param str
     * @return
     * @throws UnsupportedEncodingException
     * @throws IOException
     */
    public static String Base64Decode(String str) throws UnsupportedEncodingException, IOException {
        //return new String(new BASE64Decoder().decodeBuffer(str), "UTF-8");
        return null;
    }
}

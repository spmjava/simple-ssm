package com.spmjava.utils;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 齐伟超
 * @date 2017-12-15 16:10
 * @since 1.0.0
 **/
public class IPUtils {

    public static String getRealIP(HttpServletRequest request){
            String ip = request.getHeader("x-forwarded-for");
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)
                    || "null".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)
                    || "null".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)
                    || "null".equalsIgnoreCase(ip)) {
                ip = request.getRemoteHost();
            }
            return ip;
    }
}

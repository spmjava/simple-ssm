package com.spmjava.utils;

import java.util.UUID;

/**
 * UUID相关
 * @author 齐伟超
 * @date 2018-01-08 14:26
 * @since 1.0.0
 **/
public class UUIDUtils {

    /**
     *生成32位的uuid
     * @return
     */
    public static String uuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}

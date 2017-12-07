package com.spmjava.service;

import com.spmjava.commons.OperationResult;

/**
 * @author qi-wei-chao
 * @description: 消息服务
 * @date 2017-12-07 10:29
 * @since 1.0.0
 **/
public interface MessageService {

    /**
     * 发送邮件
     * @param to
     * @param subject
     * @param htmlText
     * @return
     */
    OperationResult sendMail(String to, String subject, String htmlText);

}

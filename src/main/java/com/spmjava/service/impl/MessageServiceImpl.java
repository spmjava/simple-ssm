package com.spmjava.service.impl;

import com.spmjava.commons.OperationResult;
import com.spmjava.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

/**
 * @author qi-wei-chao
 * @description:
 * @date 2017-12-07 11:14
 * @since 1.0.0
 **/
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public OperationResult sendMail(String to, String subject, String htmlText) {

        try {
            MimeMessage msg = javaMailSender.createMimeMessage();
            MimeMessageHelper msgHelper = new MimeMessageHelper(msg);
            msgHelper.setFrom(to);
            msgHelper.setTo(to);
            msgHelper.setSubject(subject);
            msgHelper.setText(htmlText,true);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

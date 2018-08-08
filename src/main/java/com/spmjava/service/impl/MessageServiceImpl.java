package com.spmjava.service.impl;

import com.spmjava.commons.bean.OperationResult;
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

    //@Autowired
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

            javaMailSender.send(msg);
            return null;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public OperationResult sendSms() {
  /*      TaobaoClient client = new DefaultTaobaoClient(SMSConstants.DAYU_SMS_SEND_HTTP_URL, SMSConstants
                .DAYU_ACCESS_APP_KEY, SMSConstants.DAYU_ACCESS_SECRET);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        if (messageInfo.getParamMap() != null && !messageInfo.getParamMap().isEmpty()) {
            req.setSmsParamString(JSONObject.toJSONString(messageInfo.getParamMap()).toString());
        }
        req.setSmsType(SmsConstants.DAYU_SMS_TYPE);
        req.setSmsFreeSignName(messageInfo.getParamMap().get("signName"));
        req.setRecNum(messageInfo.getMobile());
        req.setSmsTemplateCode(messageInfo.getTemplateCode());
        AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);*/
  return null;
    }
}

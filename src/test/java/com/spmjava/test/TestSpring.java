package com.spmjava.test;

import com.spmjava.test.sub.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 齐伟超
 * @date 2018-07-25 14:41
 * @since 1.0.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestSpring {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdTest() {
       System.out.println(cd);
    }

    public static void main(String args[]) {
        String templateContent = "您的客户${userName}的${prodName}借款需补充${questionStage}材料，请及时处理。";
        int indexFlag;
        StringBuilder smsContent = new StringBuilder();
        while ((indexFlag = templateContent.indexOf("}")) != -1) {
            smsContent.append(templateContent.substring(templateContent.indexOf("${") + 2, indexFlag)).append("##");
            templateContent = templateContent.substring(indexFlag);

        }
    }
}


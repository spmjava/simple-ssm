package com.spmjava.test.sub;

import com.spmjava.test.SubPerson;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author 齐伟超
 * @date 2018-08-03 15:50
 * @since 1.0.0
 **/
@Service
public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    @Autowired
    private SubPerson subPerson;

    public Person() {
        System.out.println("Person构造器");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("beanNameAware");
    }

    @Override
    public void setBeanFactory(BeanFactory factory) throws BeansException {
        System.out.println("beanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("applicationContextAware");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor before");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor after");
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("disposableBean");
    }
}

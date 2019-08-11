package com.fs.ioc.anno3;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Student implements BeanPostProcessor {



    @Value("${bean.name}")
    private String beanname;

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("------------------------after---------------");

        return bean;
    }
}

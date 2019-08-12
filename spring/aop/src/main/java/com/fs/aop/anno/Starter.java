package com.fs.aop.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.Configuration;
import java.util.Map;

public class Starter {

    public static void main(String[] args) throws Exception {

        System.setProperty("spring", "classpath");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:xml/xmlbean.xml");

//        DemoBean demo = DemoBean.class.cast(context.getBean(DemoBean.class));
        DemoBean demo = DemoBean.class.cast(context.getBean("demo"));

        demo.doJob();
    }
}

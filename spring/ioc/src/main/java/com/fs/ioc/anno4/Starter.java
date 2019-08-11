package com.fs.ioc.anno4;

import com.fs.ioc.anno3.ConfigurationAnno;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) throws Exception {

        System.setProperty("spring", "classpath");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:anno/annobean4.xml");

        AutowaireAnno conf = context.getBean(AutowaireAnno.class);

//        AutowaireAnno.class.cast()
//scopedTarget.

        conf.getSt().getAge();

        Object autowaireAnno = context.getBean("autowaireAnno");
//        Object autowaireAnno2 = context.getBean("scopedTarget.autowaireAnno");
        Object autowaireAnno3 = context.getBean(AutowaireAnno.class);
        Object t = context.getBean("teacher");
    }
}

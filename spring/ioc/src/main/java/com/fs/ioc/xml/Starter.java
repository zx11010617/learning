package com.fs.ioc.xml;

import org.apache.ibatis.ognl.enhance.ContextClassLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Starter {

    public static void main(String[] args) throws Exception {

        System.setProperty("spring", "classpath");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:xml/xmlbean.xml");
//        XmlBean bean = context.getBean("b3", XmlBean.class);
//        XmlBean bean2 = context.getBean("b1", XmlBean.class);
        XmlBean bean3 = context.getBean("b2", XmlBean.class);


//        ApplicationContext.

        // name是别名
//        System.out.println(bean);
//        System.out.println(bean2);
//        System.out.println(bean3);

    }
}

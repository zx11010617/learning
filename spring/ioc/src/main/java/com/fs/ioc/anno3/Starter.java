package com.fs.ioc.anno3;

import com.fs.ioc.anno.AnnoBean;
import com.fs.ioc.anno.ConfigurBean;
import com.fs.ioc.anno2.ABean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) throws Exception {

        System.setProperty("spring", "classpath");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:anno/annobean3.xml");

        ConfigurationAnno conf = context.getBean(ConfigurationAnno.class);

        System.out.println(conf.getName());

//        Student st = context.getBean(Student.class);

        System.out.println(conf.isOk());

    }
}

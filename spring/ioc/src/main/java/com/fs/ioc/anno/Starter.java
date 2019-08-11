package com.fs.ioc.anno;

import com.fs.ioc.anno2.ABean;
import com.fs.ioc.xml.XmlBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.Configuration;
import java.util.Map;

public class Starter {

    public static void main(String[] args) throws Exception {

        System.setProperty("spring", "classpath");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:anno/annobean.xml");
        AnnoBean bean = context.getBean("b1", AnnoBean.class);
//        XmlBean bean3 = context.getBean("b2", XmlBean.class);
//        XmlBean bean = context.getBean("b3", XmlBean.class);
        // name是别名
        System.out.println(bean.getName());
//        System.out.println(bean2);
//        System.out.println(bean3);


//        Map<String, ConfigurBean> beansOfType = context.getBeansOfType(ConfigurBean.class);
//        ConfigurBean value = beansOfType.entrySet().iterator().next().getValue();
//        System.out.println(value.getName());




//        ImportBean ib = context.getBean(ImportBean.class);
//        System.out.println(ib);

//        ManagedBean mb = context.getBean(ManagedBean.class);
//        System.out.println(mb.getAge());

        AnnoBean ab = context.getBean(AnnoBean.class);
        ConfigurBean cf = context.getBean(ConfigurBean.class);
        System.out.println(ab.getPrototypeBean());
        System.out.println(cf.getPrototypeBean());

        ABean abean = context.getBean(ABean.class);


    }
}

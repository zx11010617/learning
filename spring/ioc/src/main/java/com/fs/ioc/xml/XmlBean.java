package com.fs.ioc.xml;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class XmlBean implements BeanNameAware {

    private String nameOfBean;

    private Long ageOfBean;

    @Autowired
    private ApplicationContext app;



    public void setNameOfBean(String nameOfBean) {
        this.nameOfBean = nameOfBean;
    }

    public XmlBean() {
        System.out.println(" execute no arg constructor for XmlBean... ");
    }

    public XmlBean(String nameOfBean) {
        this.nameOfBean = nameOfBean;
        System.out.println(" execute has arg constructor for XmlBean... ");
    }


    public void setBeanName(String name) {
        System.out.println(name);
    }
}

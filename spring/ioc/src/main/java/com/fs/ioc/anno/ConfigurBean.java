package com.fs.ioc.anno;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
//@Configuration
//@ConfigurationProperties(prefix="bean")
@Data
public class ConfigurBean implements BeanNameAware{
    private String name;


    @Autowired
    private PrototypeBean prototypeBean;

    public void setBeanName(String name) {
        System.out.println(name);
    }
}

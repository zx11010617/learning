package com.fs.ioc.anno3;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource(value = "classpath:anno/bean.properties") // 可以加载xml，property文件,这个可以没有Configuration配合使用
@ConfigurationProperties(prefix = "bean") // 这个注解看不出作用
@Data
//@Component
public class ConfigurationAnno {


    @Value("${bean.name}")
    private String beanname;


    @Value("${bean.ok}")
    private boolean ok;


    private String name;

//    @Autowired
//    private Student st;

    @Bean
    public Student getSt() {
        // 如果这里是new的，会调两次？
        return new Student();
    }

    class Innter {

    }
}

package com.fs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ErukaServerApplication {

    // http://www.ityouknow.com/springcloud/2017/05/10/springcloud-eureka.html
    public static void main(String[] args) {
        SpringApplication.run(ErukaServerApplication.class, args);
    }

}

package com.fs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;


@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient2Application {

    // http://localhost:8002/actuator/refresh
    // 注意，如果在vmware上调windows主机的http，要关闭windows的防火墙。
    // 如果eruka在vmware上，client在windows上，会
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient2Application.class, args);
    }


    @Bean
    public  PartitionKeyExtractorStrategy getPartitionKeyExtractorStrategy() {

        PartitionKeyExtractorStrategy impl = new PartitionKeyExtractorStrategy() {

            @Override
            public Object extractKey(Message<?> message) {
                return message.getHeaders().getId().hashCode() % 3;
            }
        };
        return impl;
    }
}

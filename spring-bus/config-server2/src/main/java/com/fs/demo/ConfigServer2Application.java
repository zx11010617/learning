package com.fs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;


@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServer2Application {

    // http://localhost:8002/config/dev
    // http://localhost:8002/config-dev.properties
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer2Application.class, args);
    }



    @Bean
    public PartitionKeyExtractorStrategy getPartitionKeyExtractorStrategy() {

        PartitionKeyExtractorStrategy impl = new PartitionKeyExtractorStrategy() {

            @Override
            public Object extractKey(Message<?> message) {
                return message.getHeaders().getId().hashCode() % 3;
            }
        };
        return impl;
    }
}

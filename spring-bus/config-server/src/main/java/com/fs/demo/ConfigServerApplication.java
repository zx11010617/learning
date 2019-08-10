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
public class ConfigServerApplication {

    // http://localhost:8001/config/dev
    // http://localhost:8001/config-dev.properties
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
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

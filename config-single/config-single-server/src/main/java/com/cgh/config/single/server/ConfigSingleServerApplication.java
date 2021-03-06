package com.cgh.config.single.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigSingleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSingleServerApplication.class, args);
    }

}

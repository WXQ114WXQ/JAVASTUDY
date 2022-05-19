package com.qdc.demoeurekaprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

//@EnableResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class DemoEurekaProvider1Application {

   public static void main(String[] args) {
        SpringApplication.run(DemoEurekaProvider1Application.class, args);
    }

}

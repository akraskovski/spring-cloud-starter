package com.github.akraskovski.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FirstRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstRestApiApplication.class, args);
    }

}

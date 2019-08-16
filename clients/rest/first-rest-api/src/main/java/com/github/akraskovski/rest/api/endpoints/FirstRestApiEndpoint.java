package com.github.akraskovski.rest.api.endpoints;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Rest api endpoint.
 */
@RestController
public class FirstRestApiEndpoint {

    private final EurekaClient eurekaClient;

    public FirstRestApiEndpoint(EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    @RefreshScope
    @GetMapping("/message")
    public String getMessage(@Value("${message:Config server is not working}") String message) {
        return message;
    }

    @RefreshScope
    @GetMapping("/message2")
    public String getMessage2(@Value("${message2}") String message) {
        return message;
    }
}

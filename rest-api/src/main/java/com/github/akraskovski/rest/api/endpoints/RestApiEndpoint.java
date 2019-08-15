package com.github.akraskovski.rest.api.endpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Rest api endpoint.
 */
@RestController
public class RestApiEndpoint {

    private final String message;

    public RestApiEndpoint(@Value("${message:Config server is not working}") String message) {
        this.message = message;
    }

    @RefreshScope
    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}

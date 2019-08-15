package com.github.akraskovski.rest.api.endpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Second rest api endpoint.
 */
@RestController
public class SecondRestApiEndpoint {

    @GetMapping("message")
    public String getMessage(@Value("${message:Config server is not working}") String message) {
        return message;
    }
}

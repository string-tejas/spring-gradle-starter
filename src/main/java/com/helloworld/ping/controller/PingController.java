package com.helloworld.ping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("ping")
    String sayHello() {
        return "pong";
    }
}

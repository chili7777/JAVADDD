package com.demo.CrudExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public final class ApiDemo {

    @GetMapping("/health")
    public String health() {
        return "Health Server";
    }
}

package com.endlesscreation.ecsite.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable String name) {
        return ResponseEntity.ok().body("hi~ " + name);
    }
}

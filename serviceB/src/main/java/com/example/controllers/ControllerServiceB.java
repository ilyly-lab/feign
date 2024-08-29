package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerServiceB {

    @PostMapping("/process")
    public ResponseEntity<String> processRequest(@RequestBody String requestData) {
        String response = "Processed data: " + requestData;
        return ResponseEntity.ok(response);
    }
}

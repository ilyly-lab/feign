package com.example.controllers;

import com.example.clients.ServiceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceAController {


    private final ServiceBClient serviceBClient;

    @Autowired
    public ServiceAController(ServiceBClient serviceBClient) {
        this.serviceBClient = serviceBClient;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendRequest(@RequestBody String requestData) {
        String response = serviceBClient.sendRequestToServiceB(requestData);
        return ResponseEntity.ok(response);
    }
}

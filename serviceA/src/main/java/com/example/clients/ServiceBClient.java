package com.example.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service-b-client", url = "http://localhost:8081/api")
public interface ServiceBClient {

    @PostMapping("/process")
    String sendRequestToServiceB(@RequestBody String requestData);
}

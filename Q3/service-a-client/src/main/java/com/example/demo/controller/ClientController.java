package com.example.demo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @GetMapping("/call-resource")
    public String callResource() {
        String jwt = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzZXJ2aWNlQSIsInJvbGUiOiJUSERfUkVBRERJTkciLCJleHAiOjg3NjUxNzg4MDB9.GCP5uZml2_c9nSdv1Z2uFz6poYyQxkkvNNShNUKqf0A";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", jwt);
        ResponseEntity<String> response = new RestTemplate().getForEntity("http://localhost:8081/resource", String.class, headers);
        return response.getBody();
    }
}
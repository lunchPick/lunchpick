package com.lunchpick.lunchpick.controller;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthCheckController {
    @GetMapping("/ping")
    public ResponseEntity<String> healthCheck() {
        log.info("########################### success health check");
        return ResponseEntity.ok("pong");
    }
}

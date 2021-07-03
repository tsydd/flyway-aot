package com.example.flywayaot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.ResourceHint;

@SpringBootApplication
@ResourceHint(patterns = "org/flywaydb/core/internal/version.txt")
public class FlywayAotApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlywayAotApplication.class, args);
    }

}

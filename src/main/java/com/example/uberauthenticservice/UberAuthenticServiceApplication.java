package com.example.uberauthenticservice;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
@EntityScan("com.example.uberentityservice.models")
public class UberAuthenticServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberAuthenticServiceApplication.class, args);
    }

}

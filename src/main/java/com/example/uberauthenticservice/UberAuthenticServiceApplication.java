package com.example.uberauthenticservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class UberAuthenticServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberAuthenticServiceApplication.class, args);
    }

}

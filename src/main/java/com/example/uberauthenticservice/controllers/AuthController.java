package com.example.uberauthenticservice.controllers;


import com.example.uberauthenticservice.dto.PassengerDto;
import com.example.uberauthenticservice.dto.PassengerSignupRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/signup/passenger")
    public ResponseEntity<PassengerDto> singUp(@RequestBody PassengerSignupRequestDto passengerSignupRequestDto) {


        return null;
    }


}

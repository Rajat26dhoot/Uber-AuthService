package com.example.uberauthenticservice.controllers;


import com.example.uberauthenticservice.dto.PassengerDto;
import com.example.uberauthenticservice.dto.PassengerSignupRequestDto;
import com.example.uberauthenticservice.services.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;


    public AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("/signup/passenger")
    public ResponseEntity<PassengerDto> singUp(@RequestBody PassengerSignupRequestDto passengerSignupRequestDto) {
        PassengerDto response=authService.signupPassenger(passengerSignupRequestDto);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/signin/passenger")
    public ResponseEntity<?> singIn() {
        return new ResponseEntity<>(10, HttpStatus.CREATED);
    }







}

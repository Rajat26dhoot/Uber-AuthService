package com.example.uberauthenticservice.services;


import com.example.uberauthenticservice.dto.PassengerDto;
import com.example.uberauthenticservice.dto.PassengerSignupRequestDto;
import com.example.uberauthenticservice.models.Passenger;
import com.example.uberauthenticservice.repositories.PassengerRepository;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final PassengerRepository passengerRepository;



    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthService(PassengerRepository passengerRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.passengerRepository = passengerRepository;

        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public PassengerDto signupPassenger(PassengerSignupRequestDto passengerSignupRequestDto) {
        Passenger passenger=Passenger.builder()
                .email(passengerSignupRequestDto.getEmail())
                .name(passengerSignupRequestDto.getName())
                .password(bCryptPasswordEncoder.encode(passengerSignupRequestDto.getPassword())) //TODO : ENCYPT THE PASSWORD
                .phoneNumber(passengerSignupRequestDto.getPhoneNumber())
                .build();


        Passenger newPassenger= passengerRepository.save(passenger);

        PassengerDto response=PassengerDto.from(newPassenger);

        return response;
    }


}
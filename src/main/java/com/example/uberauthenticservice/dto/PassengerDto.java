package com.example.uberauthenticservice.dto;


import com.example.uberentityservice.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {

    private String id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private Date createdAt;

    public  static PassengerDto from(Passenger p) {
        PassengerDto result=PassengerDto.builder()
                .id(p.getId().toString())
                .email(p.getEmail())
                .password(p.getPassword())
                .phoneNumber(p.getPhoneNumber())
                .createdAt(p.getCreatedAt())
                .name(p.getName())
                .build();

        return result;

    }
}
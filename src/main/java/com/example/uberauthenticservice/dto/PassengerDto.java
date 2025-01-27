package com.example.uberauthenticservice.dto;


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
    private String phone;
    private String password;
    private String phoneNumber;
    private Date createdAt;
}

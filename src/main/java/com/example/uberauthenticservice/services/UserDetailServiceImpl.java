package com.example.uberauthenticservice.services;

import com.example.uberauthenticservice.helpers.AuthPassengerDetails;
import com.example.uberauthenticservice.models.Passenger;
import com.example.uberauthenticservice.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserDetailServiceImpl implements UserDetailsService {


    @Autowired
    private  PassengerRepository passengerRepository;




    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Passenger> passenger=passengerRepository.findPassengerByEmail(email);
        if(passenger.isPresent()) {
            return new AuthPassengerDetails(passenger.get());
        }else{
            throw new UsernameNotFoundException("User not found");
        }
    }


}

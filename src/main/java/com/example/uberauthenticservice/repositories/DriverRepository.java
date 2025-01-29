package com.example.uberauthenticservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.uberauthenticservice.models.Driver;


@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

}

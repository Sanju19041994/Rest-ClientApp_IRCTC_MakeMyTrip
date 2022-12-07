package com.Bit.IRCTC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bit.IRCTC.model.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}

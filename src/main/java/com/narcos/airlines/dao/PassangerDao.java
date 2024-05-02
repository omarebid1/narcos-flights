package com.narcos.airlines.dao;

import com.narcos.airlines.entity.FlightEntity;
import com.narcos.airlines.entity.PassengerEntity;
import com.narcos.airlines.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassangerDao {
    @Autowired
    private PassengerRepo passengerRepo;

    public List<PassengerEntity> getAllPassanger(){
        return this.passengerRepo.findAll();
    }
}

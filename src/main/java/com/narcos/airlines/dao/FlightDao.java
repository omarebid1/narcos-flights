package com.narcos.airlines.dao;

import com.narcos.airlines.entity.FlightEntity;
import com.narcos.airlines.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightDao {
    @Autowired
    private FlightRepo flightRepo;

    public List<FlightEntity> getAllFlights(){
        return this.flightRepo.findAll();
    }

}

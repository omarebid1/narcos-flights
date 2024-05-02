package com.narcos.airlines.dao;

import com.narcos.airlines.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightDao {
    @Autowired
    private FlightRepo flightRepo;

}

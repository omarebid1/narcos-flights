package com.narcos.airlines.controller;

import com.narcos.airlines.dao.FlightDao;
import com.narcos.airlines.entity.FlightEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    FlightDao flightDao;
    @GetMapping(path = "/getFlights")
    public List<FlightEntity> getUsers(){
        return this.flightDao.getAllFlights();
    }
}

package com.narcos.airlines.controller;

import com.narcos.airlines.dao.FlightDao;
import com.narcos.airlines.entity.FlightEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/flights")
@RestController

@CrossOrigin
public class FlightController {
    @Autowired
    FlightDao flightDao;

    @GetMapping(path = "/get-all-flights")
    public List<FlightEntity> getAllFlights() {
        return this.flightDao.getAllFlights();
    }
}

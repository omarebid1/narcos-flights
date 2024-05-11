package com.narcos.airlines.controller;

import com.narcos.airlines.dao.PassangerDao;
import com.narcos.airlines.entity.PassengerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/passengers")
@RestController

@CrossOrigin
public class PassengerController {

    @Autowired
    PassangerDao passangerDao;

    @GetMapping(path = "/get-all-passengers")
    List<PassengerEntity> getAllPassengers() {
        return this.passangerDao.getAllPassanger();
    }
}

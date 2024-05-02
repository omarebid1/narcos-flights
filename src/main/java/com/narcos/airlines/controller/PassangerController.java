package com.narcos.airlines.controller;

import com.narcos.airlines.dao.PassangerDao;
import com.narcos.airlines.entity.PassengerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassangerController {
    @Autowired
    PassangerDao passangerDao;

    @GetMapping(path = "/getAllPassangers")
    List<PassengerEntity> getAllPassangers(){
        return this.passangerDao.getAllPassanger();
    }
}

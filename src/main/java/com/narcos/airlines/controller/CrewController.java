package com.narcos.airlines.controller;

import com.narcos.airlines.dao.CrewDao;
import com.narcos.airlines.entity.CrewEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/crew")
@RestController

@CrossOrigin
public class CrewController {

    @Autowired
    private CrewDao crewDao;

    @GetMapping(path = "/get-all-crew")
    public List<CrewEntity> getAllCrew() {
        return crewDao.getAllCrew();
    }

}

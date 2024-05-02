package com.narcos.airlines.controller;

import com.narcos.airlines.dao.CrewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/crew")
@RestController

@CrossOrigin
public class CrewController {

    @Autowired
    private CrewDao crewDao;

}

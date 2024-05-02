package com.narcos.airlines.controller;


import com.narcos.airlines.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/admin")
@RestController

@CrossOrigin
public class AdminController {

    @Autowired
    private AdminDao adminDao;


}

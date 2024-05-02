package com.narcos.airlines.controller;


import com.narcos.airlines.dao.AdminDao;
import com.narcos.airlines.entity.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/admin")
@RestController

@CrossOrigin
public class AdminController {

    @Autowired
    private AdminDao adminDao;

    @GetMapping(path = "/get-all-admins")
    public List<AdminEntity> getAllAdmins() {
        return this.adminDao.getAllAdmins();
    }
}

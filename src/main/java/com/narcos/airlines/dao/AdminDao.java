package com.narcos.airlines.dao;

import com.narcos.airlines.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDao {

    @Autowired
    private AdminRepo adminRepo;


}

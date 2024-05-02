package com.narcos.airlines.dao;

import com.narcos.airlines.entity.AdminEntity;
import com.narcos.airlines.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDao {

    @Autowired
    private AdminRepo adminRepo;

    public List<AdminEntity> getAllAdmins() {
        return this.adminRepo.findAll();
    }
}

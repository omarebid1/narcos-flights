package com.narcos.airlines.dao;

import com.narcos.airlines.entity.CrewEntity;
import com.narcos.airlines.repository.CrewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrewDao {

    @Autowired
    private CrewRepo crewRepo;

    public List<CrewEntity> getAllCrew() {
        return crewRepo.findAll();
    }

}

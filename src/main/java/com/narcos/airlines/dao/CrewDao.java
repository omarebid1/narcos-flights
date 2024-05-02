package com.narcos.airlines.dao;

import com.narcos.airlines.repository.CrewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrewDao {

    @Autowired
    private CrewRepo crewRepo;

}

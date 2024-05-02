package com.narcos.airlines.dao;

import com.narcos.airlines.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassangerDao {
    @Autowired
    private PassengerRepo passengerRepo;
}

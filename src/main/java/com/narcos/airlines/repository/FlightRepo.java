package com.narcos.airlines.repository;


import com.narcos.airlines.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightRepo extends JpaRepository<FlightEntity, Integer> {

}

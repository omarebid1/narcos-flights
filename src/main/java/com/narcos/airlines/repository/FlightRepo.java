package com.narcos.airlines.repository;


import com.narcos.airlines.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<FlightEntity, Integer> {


}

package com.narcos.airlines.repository;

import com.narcos.airlines.entity.PassengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<PassengerEntity, Integer> {


}

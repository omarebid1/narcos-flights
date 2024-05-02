package com.narcos.airlines.repository;

import com.narcos.airlines.entity.PassangerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<PassangerEntity, Integer> {


}

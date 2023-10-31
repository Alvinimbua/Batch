package com.imbuka.batchprocessing.repository;

import com.imbuka.batchprocessing.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}

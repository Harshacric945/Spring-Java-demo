package com.train.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.model.PassengerDetails;

@Repository
public interface PassengerDetailsRepository extends JpaRepository<PassengerDetails, Integer> {

}

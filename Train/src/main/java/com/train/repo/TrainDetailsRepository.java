package com.train.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.model.TrainDetails;

@Repository
public interface TrainDetailsRepository extends JpaRepository<TrainDetails, Integer>{
	

}

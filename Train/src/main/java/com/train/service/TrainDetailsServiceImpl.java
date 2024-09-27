package com.train.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.model.TrainDetails;
import com.train.repo.TrainDetailsRepository;
@Service
public class TrainDetailsServiceImpl implements TrainDetailsService {
	@Autowired
	TrainDetailsRepository trainDetailsRepository;

	@Override
	public TrainDetails getTrainDetails(Integer trainNumber) {
		TrainDetails train = trainDetailsRepository.findById(trainNumber).get();
		return train;
		
	}

	@Override
	public TrainDetails postTrainDetails(TrainDetails trainDetails) {
		
		TrainDetails train = trainDetailsRepository.save(trainDetails);
		return train;
	}

	@Override
	public TrainDetails updateTrainDetails(TrainDetails trainDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainDetails deleteTrainDetails(TrainDetails trainNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}

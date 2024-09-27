package com.train.service;


import com.train.model.TrainDetails;

public interface TrainDetailsService {

	public TrainDetails getTrainDetails( Integer trainNumber);	
	public TrainDetails postTrainDetails( TrainDetails trainDetails);
	public TrainDetails updateTrainDetails( TrainDetails trainDetails);
	public TrainDetails deleteTrainDetails( TrainDetails trainNumber);
}

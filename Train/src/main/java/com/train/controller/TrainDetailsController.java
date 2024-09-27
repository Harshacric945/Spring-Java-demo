package com.train.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.train.model.TrainDetails;
import com.train.service.TrainDetailsService;

@Controller
@RequestMapping("/train")

public class TrainDetailsController {
	@Autowired
	TrainDetailsService traindetailsservice;

	@PostMapping("/addTrainDetails")
	public TrainDetails postTrainDetails(@RequestBody TrainDetails trainDetails) {
		return traindetailsservice.postTrainDetails(trainDetails);
	}

	@GetMapping("/getTrainDetails/{trainNumber}")
	public TrainDetails getTrainDetails(@PathVariable Integer trainNumber) {
		return traindetailsservice.getTrainDetails(trainNumber);
	}
}

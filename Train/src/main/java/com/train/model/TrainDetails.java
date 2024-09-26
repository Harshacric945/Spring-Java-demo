package com.train.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class TrainDetails {
	@Id
	private Integer trainNumber;
	private String trainName;
	private Integer numberOfSeats;
	private String stationFrom;
	private String stationTo;

	public TrainDetails(Integer trainNumber, String trainName, Integer numberOfSeats, String stationFrom,
			String stationTo) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.numberOfSeats = numberOfSeats;
		this.stationFrom = stationFrom;
		this.stationTo = stationTo;
	}

	public Integer getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getStationFrom() {
		return stationFrom;
	}

	public void setStationFrom(String stationFrom) {
		this.stationFrom = stationFrom;
	}

	public String getStationTo() {
		return stationTo;
	}

	public void setStationTo(String stationTo) {
		this.stationTo = stationTo;
	}

	@Override
	public String toString() {
		return "TrainDetails [trainNumber=" + trainNumber + ", trainName=" + trainName + ", numberOfSeats="
				+ numberOfSeats + ", stationFrom=" + stationFrom + ", stationTo=" + stationTo + "]";
	}

}

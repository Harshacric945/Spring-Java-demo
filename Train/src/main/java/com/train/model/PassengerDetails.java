package com.train.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class PassengerDetails {
	@Id
	private Integer pnrNo;
	private String name;
	private Integer age;
	private Long mobileNo;
	private String ticketFrom;
	private String ticketTo;

	public PassengerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerDetails(Integer pnrNo, String name, Integer age, Long mobileNo, String ticketFrom,
			String ticketTo) {
		super();
		this.pnrNo = pnrNo;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.ticketFrom = ticketFrom;
		this.ticketTo = ticketTo;
	}

	public Integer getpnrNo() {
		return pnrNo;
	}

	public void setpnrNo(Integer pnrNo) {
		this.pnrNo = pnrNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getmobileNo() {
		return mobileNo;
	}

	public void setmobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getTicketFrom() {
		return ticketFrom;
	}

	public void setTicketFrom(String ticketFrom) {
		this.ticketFrom = ticketFrom;
	}

	public String getTicketTo() {
		return ticketTo;
	}

	public void setTicketTo(String ticketTo) {
		this.ticketTo = ticketTo;
	}

	@Override
	public String toString() {
		return "PassengerDetails [pnrNo=" + pnrNo + ", name=" + name + ", age=" + age + ", mobileNo=" + mobileNo
				+ ", ticketFrom=" + ticketFrom + ", ticketTo=" + ticketTo + "]";
	}

}

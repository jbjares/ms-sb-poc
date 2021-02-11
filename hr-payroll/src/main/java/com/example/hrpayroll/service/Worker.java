package com.example.hrpayroll.service;

import java.io.Serializable;

//TODO This object should be moved for the CORE of the project
public class Worker implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2454092333821834789L;

	private Long id;
	
	private String name;
	
	private Double dailyIncome;

	public Worker(Long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}
	
	public Worker() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	
	
	

}

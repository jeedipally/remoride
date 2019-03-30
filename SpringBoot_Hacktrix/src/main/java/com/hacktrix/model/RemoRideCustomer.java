package com.hacktrix.model;

/*Written by Praveen Parsa*/
public class RemoRideCustomer {
	
	private int id;
	
	private String name;
	
	private String companyName;
	
	private String currentLocation;
	
	private String income;
	
	private String rent;
	
	private int riskFactor;
	
	RemoRideCustomer(){
		
	}
	
	RemoRideCustomer(int id,String name, String companyName, String currentLocation, String income, String rent){
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.currentLocation = currentLocation;
		this.income = income;
		this.rent = rent;
	}

	public int getRiskFactor() {
		return riskFactor;
	}

	public void setRiskFactor(int riskFactor) {
		this.riskFactor = riskFactor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}
}

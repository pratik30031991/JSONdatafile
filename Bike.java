package com.demo.json.model;



public class Bike {
	
	String bikeName;
	String bikeCompany;
	String bikeEngine;
	String bikePrice;
	String bikeColor;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String bikeName, String bikeCompany, String bikeEngine, String bikePrice, String bikeColor) {
		super();
		this.bikeName = bikeName;
		this.bikeCompany = bikeCompany;
		this.bikeEngine = bikeEngine;
		this.bikePrice = bikePrice;
		this.bikeColor = bikeColor;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeCompany() {
		return bikeCompany;
	}

	public void setBikeCompany(String bikeCompany) {
		this.bikeCompany = bikeCompany;
	}

	public String getBikeEngine() {
		return bikeEngine;
	}

	public void setBikeEngine(String bikeEngine) {
		this.bikeEngine = bikeEngine;
	}

	public String getBikePrice() {
		return bikePrice;
	}

	public void setBikePrice(String bikePrice) {
		this.bikePrice = bikePrice;
	}

	public String getBikeColor() {
		return bikeColor;
	}

	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}

	@Override
	public String toString() {
		return "{ 'bikeName' : '"+ bikeName+"', 'bikeCompany' :"+bikeCompany+"', 'bikeEngine' : '"+bikeEngine+"', 'bikePrice' : '"+bikePrice+"', 'bikeColor' : '"+bikeColor+"' }";
	}
	
	
	

}

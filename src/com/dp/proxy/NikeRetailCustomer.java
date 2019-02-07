package com.dp.proxy;

// 终端客户
public class NikeRetailCustomer implements NikeCustomer{

	public static enum Location{
		HUBEI,BEIJING,JAPAN;
	}
	
	private Location location;
	private double discount;
	
	public NikeRetailCustomer(Location location, double discount) {
		super();
		this.location = location;
		this.discount = discount;
	}


	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getDiscount() {
		return discount;
	}

	
}

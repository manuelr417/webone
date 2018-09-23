package edu.uprm.cse.datastructures.p1.model;

public class Car {
	private long carId;
	public Car(long carId, String carName) {
		super();
		this.carId = carId;
		this.carName = carName;
	}
	public long getCarId() {
		return carId;
	}
	public String getCarName() {
		return carName;
	}
	private String carName;

}

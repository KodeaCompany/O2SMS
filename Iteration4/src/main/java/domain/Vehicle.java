package domain;

public class Vehicle {

	private String plateNumber;
	private String brand;
	private String model;

	public Vehicle() {
		// TODO - implement Vehicle.Vehicle
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param license
	 * @param brand
	 * @param model
	 */
	public Vehicle(String license, String brand, String model) {
		// TODO - implement Vehicle.Vehicle
		throw new UnsupportedOperationException();
	}

	public Owner getOwner() {
		// TODO - implement Vehicle.getOwner
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param owner
	 */
	public void setOwner(Owner owner) {
		// TODO - implement Vehicle.setOwner
		throw new UnsupportedOperationException();
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	/**
	 * 
	 * @param plateNumber
	 */
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getBrand() {
		return this.brand;
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	/**
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

}
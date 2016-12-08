package Domain;

public class Vehicle {

	private String plateNumber;
	private String brand;
	private String model;

	/**
	 * 
	 * @param plateNumber
	 */
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public Vehicle() {
		// TODO- implement Vehicle.Vehicle
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 
	 * @param o
	 */
	public void setOwner(Owner o) {
		// TODO - implement Vehicle.setOwner
		throw new UnsupportedOperationException();
	}

}
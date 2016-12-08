package domain;

import java.util.*;

public class Driver extends Person {

	Collection<Sanction> sanctions;
	private int points;
	
	public Driver() {
		// TODO - implement Driver.Driver
		throw new UnsupportedOperationException();
	}

	public int getPoints() {
		return this.points;
	}

	/**
	 * 
	 * @param points
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	public void readUnpaidSanctions() {
		// TODO - implement Driver.readUnpaidSanctions
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param s
	 */
	public void setUnpaidSanctions(Sanction[] s) {
		// TODO - implement Driver.setUnpaidSanctions
		throw new UnsupportedOperationException();
	}

	public Sanction[] getUnpaidSanctions() {
		// TODO - implement Driver.getUnpaidSanctions
		throw new UnsupportedOperationException();
	}

}
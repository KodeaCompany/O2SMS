package domain;
import java.util.Date;

public class Sanction {

	private int id;
	private double amountToPay;
	private int pointsReduction;
	private Date dateOfReception;
	private Date dateOfPayment;
	
	public Sanction() {
		// TODO - implement Sanction.Sanction
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public double getAmountToPay() {
		return this.amountToPay;
	}

	/**
	 * 
	 * @param amountToPay
	 */
	public void setAmountToPay(double amountToPay) {
		this.amountToPay = amountToPay;
	}

	public int getPointsReduction() {
		return this.pointsReduction;
	}

	/**
	 * 
	 * @param pointsReduction
	 */
	public void setPointsReduction(int pointsReduction) {
		this.pointsReduction = pointsReduction;
	}

	public Date getDateOfReception() {
		return this.dateOfReception;
	}

	/**
	 * 
	 * @param dateOfReception
	 */
	public void setDateOfReception(Date dateOfReception) {
		this.dateOfReception = dateOfReception;
	}

	public Date getDateOfPayment() {
		return this.dateOfPayment;
	}

	/**
	 * 
	 * @param dateOfPayment
	 */
	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	public Driver getDriver() {
		// TODO - implement Sanction.getDriver
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param d
	 */
	public void setDriver(Driver d) {
		// TODO - implement Sanction.setDriver
		throw new UnsupportedOperationException();
	}

	public void calculatePoints() {
		// TODO - implement Sanction.calculatePoints
		throw new UnsupportedOperationException();
	}

	public void calculateAmountToPay() {
		// TODO - implement Sanction.calculateAmountToPay
		throw new UnsupportedOperationException();
	}

}
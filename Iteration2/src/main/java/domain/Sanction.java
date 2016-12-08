package Domain.;

public class Sanction {

	Inquiry inquiry;
	private int id;
	private double amountToPay;
	private int pointsReduction;
	private Date dateOfReception;
	private Date dateOfPayment;

	/**
	 * 
	 * @param i
	 */
	public Sanction(Inquiry i) {
		// TODO - implement Sanction.Sanction
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

	public double getAmountToPay() {
		return this.amountToPay;
	}

	public int getPointsReduction() {
		return this.pointsReduction;
	}

	public Date getDateOfReception() {
		return this.dateOfReception;
	}

	public Date getDateOfPayment() {
		return this.dateOfPayment;
	}

	public Driver getDriver() {
		// TODO - implement Sanction.getDriver
		throw new UnsupportedOperationException();
	}

}
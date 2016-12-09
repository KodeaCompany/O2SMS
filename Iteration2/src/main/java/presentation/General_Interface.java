package presentation;
import domain.Inquiry;
import java.sql.SQLException;
import domain.Sanction;

public class General_Interface {
	
	public static void main(String [] args){
		Inquiry i = new Inquiry(31,30);
		createSanctions(i);
	}

	/**
	 * Method to create a sanction when an inquiry is created
	 * @param i inquiry from which we'll calculate the points and amount to pay for the sanction
	 */
	public static void createSanctions(Inquiry i) {
		Sanction s = new Sanction(i);
	}

}
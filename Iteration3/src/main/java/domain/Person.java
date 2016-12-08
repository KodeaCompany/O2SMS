package domain;

public class Person {

	private String dni;
	private String name;
	private String surname;
	private int contactNumber;
	private String fullAddress;

	public Person() {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dni
	 * @param name
	 * @param surname
	 * @param contactNumber
	 * @param fullAddress
	 */
	public Person(String dni, String name, String surname, int contactNumber, String fullAddress) {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dni
	 */
	public Person findPersonByDNI(String dni) {
		// TODO - implement Person.findPersonByDNI
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contactNumber
	 */
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * 
	 * @param fullAddress
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
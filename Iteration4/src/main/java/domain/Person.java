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

	public String getDni() {
		return this.dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getContactNumber() {
		return this.contactNumber;
	}

	/**
	 * 
	 * @param contactNumber
	 */
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getFullAddress() {
		return this.fullAddress;
	}

	/**
	 * 
	 * @param fullAddress
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

}
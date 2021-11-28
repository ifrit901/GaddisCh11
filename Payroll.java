package ch11java6thedition;

/**
 * This is the Payroll class from programming challenge number 5.
 * 
 * @author craig
 */
public class Payroll {
	// Class fields
	private String name;
	private int idNumber;
	private double payRate;
	private int numberOfHoursWorked;

	// Constructors

	public Payroll() {
		name = "";
		idNumber = 0;
		payRate = 0.0;
		numberOfHoursWorked = 0;
	}

	public Payroll(String n, int idNum) throws EmptyString, InvalidID {
		name = n;
		if (name.equals("")) {
			throw new EmptyString(name);
		}
		idNumber = idNum;
		if(idNumber < 1) {
			throw new InvalidID(idNumber);
		}
	}

	// Getter methods

	/**
	 * Method for getting the name.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method for getting the idNumber.
	 * @return idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * Method for getting the payrate.
	 * @return payRate.
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * Method for getting the hours worked
	 * @return numberOfHoursWorked
	 */
	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	// Setter methods

	/**
	 * The setName method accepts a String argument
	 * and assigns it to the name field.
	 * @param n The name of the employee.
	 * @throws EmptyString
	 */
	public void setName(String n) throws EmptyString{
		if(name.equals("")) {
			throw new EmptyString(name);
		}
		name = n;
	}

	/** 
	 * The setIdNumber accepts an integer argument 
	 * and assigns it to the idNumber field.
	 * @param id The ID number of the employee.
	 * @throws InvalidID
	 */
	public void setIdNumber(int id) throws InvalidID{
		if(idNumber < 1) {
			throw new InvalidID(idNumber);
		}
		idNumber = id;
	}

	/**
	 * The setPayRate method accepts a double argument
	 * and assigns it to the payRate field.
	 * @param rate The hourly pay rate of the employee.
	 * @throws InvalidHourlyPayRate
	 */
	public void setPayRate(double rate) throws InvalidHourlyPayRate{
		if(rate < 0 || rate > 25) {
			throw new InvalidHourlyPayRate(rate);
		}
		payRate = rate;
	}

	/**
	 * The setNumberOfHoursWorked method has an entirely 
	 * too long name. It accepts an integer argument 
	 * and assigns it to the numberOfHoursWorked field.
	 * @param hrs The number of hours the employee worked. 
	 * @throws InvalidNumberOfHoursWorked
	 */
	public void setNumberOfHoursWorked(int hrs) throws InvalidNumberOfHoursWorked{
		if(hrs < 0 || hrs > 84) {
			throw new InvalidNumberOfHoursWorked(hrs);
		}
		numberOfHoursWorked = hrs;
	}

	/**
	 * The grossPay method returns the calculated pay
	 * of hours times rate of pay.
	 * @return grossPay
	 */
	public double grossPay(int hrs, double rate) {
		double grossPay = hrs * rate;
		return grossPay;
	}

	/**
	 * The overridden toString method formats the employee information
	 * @return The formatted data.
	 */
	@Override
	public String toString() {
		return String.format("Employee: " + name + "\n"
		+ "ID: " + idNumber + "\n" + "Hours worked: " 
		+ numberOfHoursWorked + "\n" + "Gross pay: $" 
		+ grossPay(numberOfHoursWorked, payRate) + "\n"
		+ "Hourly pay rate: $" + payRate + "/hour\n"
		+ "Number of hours worked: " + numberOfHoursWorked);
			
	} 
}

package ch11java6thedition;


/**
 * The Employee class for programming challenge #1.
 * (in chapter 10) 
 * @author craig
 * 6/14/21
 * 11:06am
 * On ambulance with Colin.
 */
public class EmployeeException {

	private String name;
	private String number;
	private String hireDate;
	private Character minValue = 'A';
	private Character maxValue = 'M';	
	private char [] employeeNumber;

	/**
	 * Constructor accepts arguments for 
	 * name, number, and hire date.
	 * @param name The employee's name
	 * @param number The employee's number
	 * @param hireDate The date the employee was hired
	 */
	public EmployeeException(String name, String number, String hireDate)	
		throws InvalidEmployeeNumber{

		this.name = name;

		employeeNumber = number.toCharArray();

		for(int i = 0; i < 3; i++) {
			if (!Character.isDigit(employeeNumber[i])) {
				throw new InvalidEmployeeNumber(number);
			}
		}

		if (employeeNumber[3] != '-') {
			throw new InvalidEmployeeNumber(number);
		}

		employeeNumber[4] = Character.toUpperCase(employeeNumber[4]);

		if (employeeNumber[4] < minValue || employeeNumber[4] > maxValue) {
			throw new InvalidEmployeeNumber(number);
		}

		this.number = number;
		this. hireDate= hireDate;

	}
	// Accessors

	/**
	 * The getName method returns the 
	 * name of the employee.
	 * @return The name of the employee
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * The getNumber method returns the
	 * employee's number.
	 * @return The number of the employee
	 */
	public String getNumber() {
		return this.number;
	}

	/**
	 * The getHireDate method returns the
	 * date the employee was hired.
	 * @return The employee's hire date
	 */
	public String getHireDate() {
		return this.hireDate;
	}

	// Mutators

	/**
	 * The setName method sets the 
	 * employee's name.
	 * @param name The name of the employee
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The setNumber method sets the
	 * employee's number.
	 * @param number The employee number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * The setHireDate method sets the 
	 * employee's hire date.
	 * @param hireDate 
	 */
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String toString() {
		return "Name: " + this.getName() + "\n" +
		          "Employee #: " + this.getNumber() + "\n" +
		          "Hire Date: " + this.getHireDate() + "\n";
	}
}

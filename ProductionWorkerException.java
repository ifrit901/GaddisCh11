package ch11java6thedition;


/**
 * The ProductionWorker class for programming 
 * challenge #1. It extends the Employee class.
 * (this is for chapter 11 which adds exceptions)
 * 
 * @author craig
 */
public class ProductionWorkerException extends EmployeeException {
	
	private int shift;
	private double hourlyPayRate;

		
	/**
	 * Constructor accepts an int and a double 
	 * for shift and pay rate.
	 * @param shift The day or night shift as integers
	 * @param hourlyPayRate The employee's pay rate
	 * @exception InvalidShift When invalid shift is entered.
	 * @exception InvalidPayRate When an invalid pay rate is entered.
	 */
	public ProductionWorkerException(String name, String number, String hireDate, 
			          int shift, double hourlyPayRate) 
			          throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber{
		super(name, number, hireDate);	

		if(shift < 1 || shift > 2) {
			throw new InvalidShift(shift);
		}
		this.shift = shift;

		if(hourlyPayRate < 0) {
			throw new InvalidPayRate(hourlyPayRate);
		} 
		this.hourlyPayRate = hourlyPayRate;
	}

	// Accessors

	/**
	 * The getShift method returns the 
	 * shift of the employee.
	 * @return The employee's shift
	 */
	public int getShift() {
		return this.shift;
	}

	/**
	 * The getHourlyPayRate returns 
	 * the hourly pay rate of the employee.
	 * @return The employee's pay rate
	 */
	public double getHourlyPayRate() {
		return this.hourlyPayRate;
	}

	// Mutators

	/**
	 * The setShift method sets the 
	 * employee's shift.
	 * @param shift The shift as an integer
	 * @throws InvalidShift
	 */
	public void setShift(int shift) throws InvalidShift{
		if(shift < 1 || shift > 2) {
			throw new InvalidShift(shift);
		}
		this.shift = shift;
	}

	/**
	 * The setHourlyPayRate sets the
	 * employee's pay rate.
	 * @param hourlyPayRate The employee's pay rate by hour.
	 * @throws InvalidPayRate If the pay rate is negative.
	 */
	public void setHourlyPayRate(double hourlyPayRate) throws InvalidPayRate{

		if(hourlyPayRate < 0) {
			throw new InvalidPayRate(hourlyPayRate);
		}
		this.hourlyPayRate = hourlyPayRate;
	}

	@Override
	public String toString() {
		return super.toString() +
		          "Shift: " + this.getShift() + "\n" + 
		          "Hourly Pay: $" + this.getHourlyPayRate() + "\n";
	}

}

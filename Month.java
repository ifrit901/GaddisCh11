package ch11java6thedition;

/**
 * This is programming challenge #5. 
 * 
 * 5. Month class
 * 
 * Write a class named Month. The class should have an int field called 
 * monthNumber that holds the number of the month. For example, January 
 * would be 1, February would be 2, and so on. In addition, it should 
 * have the following methods:
 * 
 * - A no-arg constructor that sets the monthNumber field to 1. 
 * - A constructor that accepts the number of the month as an argument.
 *   It should set the monthNumber field to the value passed as the argument.
 * - A constructor that accepts the name of a month such as "January" as an
 *   argument. It should set the monthNumber field to the correct corresponding
 *   value.
 * - A setMonthNumber method accepts an int argument, which is assigned to the 
 *   monthNumber field. If a value less than 1 or greater than 12 is passed,
 *   it should set the field to 1.
 * - A getMonthNumber method that returns the value in monthNumber.
 * - A getMonthName method that returns the name of the month.
 * - A toString method that returns the same thing as the getMonthName method.
 * - An equals method that accepts a Month object as an argument. If the 
 *   argument object holds the same data as the calling object, then it 
 *   should return true. Otherwise, it should return false.
 * 
 * @author craig
 * 2-3-21
 * 9:58am
 */
public class Month {
	private int monthNumber;
	private String monthName;

	private final String [] Months = {"JANUARY", "FEBRUARY", "MARCH", 
					  "APRIL", "MAY", "JUNE", "JULY", 
					  "AUGUST", "SEPTEMBER", "OCTOBER", 
					  "NOVEMBER", "DECEMBER"}; 

	public Month() {
		monthNumber = 1;
	}

	public Month(int monthNumber) throws InvalidMonthNumber{
		if(monthNumber < 1 || monthNumber > 12) {
			this.monthNumber = 1;
		}
		else
			this.monthNumber = monthNumber;
	}
		
	public Month(String month) throws InvalidMonthName{
		boolean isMonth = false;

		for(String months : Months) {
			if(month.equals(months)) {
				isMonth = true;
			}
		}
		if(!isMonth) {
			System.out.println(isMonth);
			throw new InvalidMonthName(month);
		}
		while(isMonth) {
			for(int i = 0; i < Months.length; i++) {
				if(month.equalsIgnoreCase(Months[i])) {
				monthNumber = i + 1;
			}
				else
				monthNumber = 1;
			}
		}
		
	}	

	public void setMonthNumber(int num) throws InvalidMonthNumber{

		if(num < 1 || num > 12) {
			throw new InvalidMonthNumber(num);
		}
		else
			monthNumber = num;
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	public String getMonthName() {
		monthName = Months[getMonthNumber() - 1];
		return monthName;
	}

	public String toString() {
		return getMonthName();
	}

	public boolean equals(Month m) {
		boolean isEqual;
		if(this.getMonthNumber() == m.getMonthNumber() 
			&& this.getMonthName().equals(m.getMonthName())) {
			isEqual = true;
		}
		else
			isEqual = false;

		return isEqual;
	}

	public boolean greaterThan(Month m) {
		boolean isGreaterThan;
		if(m.getMonthNumber() < this.getMonthNumber()) 
			isGreaterThan = true;
		else
			isGreaterThan = false;
		
		return isGreaterThan;
	}

	public boolean lessThan(Month m) {
		boolean isLessThan;
		if(m.getMonthNumber() > this.getMonthNumber()) 
			isLessThan = true;
		else
			isLessThan = false;

		return isLessThan;
	}
}

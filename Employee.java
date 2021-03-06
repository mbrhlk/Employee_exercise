package ca.java.exercise;

public class Employee {
	protected String firstName;
	private String lastName;
	private String email;
	private int startMonth;
	private int startYear;
	private String phoneNum;
	private double totalIncome;
	
	public double calculateIncome(int payRate, int hoursWorking){
		totalIncome = payRate * hoursWorking;
		return totalIncome;
	}
	

	public Employee(String firstName, String lastName, String email, int startMonth, int startYear, String phoneNum) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setStartMonth(startMonth);
		setStartYear(startYear);
		setPhoneNum(phoneNum);
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public int getStartMonth() {
		return startMonth;
	}
	public int getStartYear() {
		return startYear;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	
	public String setFirstName(String firstName) {
		return this.firstName = firstName;	
	}
	public String setLastName(String lastName) {
		return this.lastName = lastName;	
	}
	public String setEmail(String email) {
		return this.email = email;	
	}
	public void setStartMonth(int startMonth) {
		if(startMonth<=12 && startMonth>=1) {
			this.startMonth = startMonth;
		} else {
			this.startMonth = 0;
		}
	}
	public void setStartYear(int startYear) {
		if (startYear > 1900) {
			this.startYear = startYear;
		} else {
			this.startYear = 1900;
		}
	}
	public void setPhoneNum(String phoneNum) {
		if (!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			this.phoneNum = phoneNum;
		} else {
			this.phoneNum = "Unknown";
		}
		
	String toString() {
		return "Name : " + getFirstName() + " " + getLastName() +
				"\nEmail : " + getEmail() + 
				"\nStartMonth : " + getStartmonth();
		}
	}
}






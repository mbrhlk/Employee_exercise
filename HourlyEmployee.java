package ca.java.exercise;

public class HourlyEmployee extends Employee {
	private int hoursWorking;
	private int payRate = 15;
	
	public HourlyEmployee(
			String firstName, 
			String lastName, 
			String email, 
			int startMonth, 
			int startYear, 
			int hoursWorking, 
			int payRate,
			String phoneNumber) {
		super(firstName, lastName, email, startMonth, startYear, phoneNumber);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);
	}
	
	public double getPayRate(double totalAmount) {
		return (totalAmount * payRate) /100;
	}
	
	private void setHoursWorking(int hoursWorking) {
		if(hoursWorking<=40 && hoursWorking>=1) {
			this.hoursWorking = hoursWorking;
		} else {
			this.hoursWorking = 0;
		}
	}


	private int setPayRate(int payRate) {
		return payRate;
	}

	public int getPayRate() {
		return payRate;
	}

	public int getHoursWorking() {
		return hoursWorking;
	}
}

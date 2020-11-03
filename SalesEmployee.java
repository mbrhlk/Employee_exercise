package ca.java.exercise;

public class SalesEmployee extends Employee {
	private double totalSales;
	private double commitionRate;

	public SalesEmployee(String firstName, String lastName, String email, int startMonth, int startYear, double commitionRate, double totalSales, String phoneNum) {
		super(firstName, lastName, email, startMonth, startYear, phoneNum);
		getCommitionRate(commitionRate);
		getTotalSales(totalSales);
	}

	private double getCommitionRate(double commitionRate) {
		if(commitionRate < 0) {
			return 1;
		} else {
			return this.commitionRate;
		}
		
	}

	private double getTotalSales(double totalSales) {
		return totalSales;

	
	}
	
}





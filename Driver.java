package ca.java.exercise;

import java.util.ArrayList;

public class Driver {
	private static HourlyEmployee[] Employees;
	
	public static void printInformation(HourlyEmployee e1) {
		System.out.println("The total Payment is " + e1.getPayRate());
	}
	
	public static void main(String[] args) {
		HourlyEmployee E1 = new HourlyEmployee("John", "Doe", "doe.john@gmail.com", 2, 2009, 32, 9, "999-9999");
		HourlyEmployee E2 = new HourlyEmployee("Jane", "River", "river@gmail.com", 12, 2016, 33, 10, "999-9999");
		HourlyEmployee E3 = new HourlyEmployee("Mary", "Stuart", "mary@gmail.com", 3, 1995, 40, 14, "999-9999");
		HourlyEmployee E4 = new HourlyEmployee("Robert", "Davis", "davis@gmail.com", 4, 2003, 19, 0, "999-9999");
		ArrayList<Employee> emp1 = new ArrayList<Employee>();
		
		
		Employees = new HourlyEmployee[3];
		Employees[0] = E1;
		
		printInformation(E1);	
	}
	
}

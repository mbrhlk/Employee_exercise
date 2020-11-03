package ca.java.exercise;

public class Driver {
	private static HourlyEmployee[] Employees;
	
	public static void printInformation(HourlyEmployee e1) {
		System.out.println("The total Payment is " + e1.getPayRate());
	}
	
	public static void main(String[] args) {
		HourlyEmployee E1 = new HourlyEmployee("Otavio", "Padovani", "asd", 0, 0, 100, 0, "tesfa");
		
		Employees = new HourlyEmployee[3];
		Employees[0] = E1;
		
		printInformation(E1);	
	}
}
	
	
	

package oop;

public class Emp {

	public static void main(String[] args) {
	
		
		Employee emp1= new Employee(1985,45,2000.0,"Ali");
		System.out.println("Name : " + emp1.name());
		System.out.println("Tax : " + emp1.tax());
		System.out.println("Bonus : " + emp1.bonus());
		System.out.println(" Salary increase : " + emp1.increase());

		System.out.println("Total Salary : " + ( emp1.salary - emp1.tax() + emp1.bonus() +emp1.increase()));
	}

}

package oop;

public class Employee {
private String name;
public double salary;
private int workHours, hireYear;

Employee(int hireYear, int workHours, double salary, String name) {
	this.hireYear = hireYear;
	this.workHours= workHours;
	this.salary= salary;
	this.name= name;
	
	
}
 public double tax() {
	 
	 if(this.salary >= 1000) {
		 return salary*0.03;
		 
	 }
	 else
		 return 0.0;
	 
 }
 
	public double bonus() {
		int exstraHours = this.workHours-40;
		if(exstraHours >0) {
	    return 30*exstraHours; 
	}
		return 0.0;
	}
	
	public double increase() {
		int year = 2022-this.hireYear;
		if(year < 10) {
			return this.salary*0.5;
		}
		else if (year >=10) {
			return salary * 0.10;
		}
		else {
			return salary * 0.15;
		}
	}
	public String name() {
		return this.name;
	}
	
	
	public static void main(String[] args) {
	
		
		Employee emp1= new Employee(1985,45,2000.0,"Ali");
		System.out.println("Name : " + emp1.name());
		System.out.println("Tax : " + emp1.tax());
		System.out.println("Bonus : " + emp1.bonus());
		System.out.println(" Salary increase : " + emp1.increase());

		System.out.println("Total Salary : " + ( emp1.salary - emp1.tax() + emp1.bonus() +emp1.increase()));
	}

}





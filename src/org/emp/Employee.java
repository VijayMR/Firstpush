package org.emp;

public class Employee {
	public void empId(String a) {
		System.out.println("The string value is "+a);
	}
	public void empId(int b) {
		System.out.println("The integer value is "+b);
	}
	public void empId(char c) {
		System.out.println("The character value is "+c);
		System.out.println("The character value is 1" );
		System.out.println("The character value is 2 ");
		System.out.println("The character value is 3 ");
		int o=0;
		o=4;
		System.out.println("the value of o is "+o);
	}
	public void empId(float e) {
		System.out.println("The float value is "+e);
	}
	public void empId(double f) {
		System.out.println("The double value is "+f);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId("vijay");
		e.empId('A');
		e.empId(7);
		e.empId(9.666666d);
		e.empId(45.12f);
	}
		

}
 
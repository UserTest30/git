package org.cts.java;

//AccessSpacifier class ClassName
public class Employee {
	
	private void empId() {//ctrl+Space,Enter
		
		System.out.println("Employee id is 6543");//sysout,ctrl+space
	}
	private void empName() {

		System.out.println("Employee name is ");
		System.out.println("Employee name is raj");
		System.out.println("Employee name is velmurgan");
		System.out.println("Employee name is subash");

	}
	
public static void main(String[] args) {
	
//	object creation
//	ClassName ObjectName =new ClassName();
	Employee a = new Employee();
//	method Calling
//	ObjectName.methodName();
	a.empId();
	a.empName();
	
}
}

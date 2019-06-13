package org.ruby;

public class Employee {
		public void empID(int id) {
			System.out.println("EmpId is : " +id);

		}
		public void empName(String name, String email) {
			System.out.println("Emp Name is : " + name);
			System.out.println("Emp Email is : " + email);

		}
		public static void main(String[] args) {
			Employee emp = new Employee();
			emp.empID(2470);
			emp.empName("Ruby", "rubysherly@gmail.com");
			
		}

	}



package q2;

import q2.Workers.*;

public class Main {

	public static void main(String[] args) {
	
		Employee employee = new Employee();
		System.out.println(employee.calsal(2000));
		
		Manager manager = new Manager();
		System.out.println(manager.calsal(2000,2000));
	}
}

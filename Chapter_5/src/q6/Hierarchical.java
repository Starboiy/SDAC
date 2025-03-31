package q6;

class CEOs{
	
	void AccountantTask() {
		System.out.println("task for Accountant");
	}
	
	void EmployeeTask() {
		System.out.println("task for Employee");
	}
}

class Accountantss extends CEOs{
	
	@Override
	void AccountantTask() {
		// TODO Auto-generated method stub
		super.AccountantTask();
	}

}

class Employe extends CEOs{
	
	@Override
	void EmployeeTask() {
		// TODO Auto-generated method stub
		super.EmployeeTask();
	}

}

public class Hierarchical {

	public static void main(String[] args) {
		 
		Accountantss accountant = new Accountantss();
		accountant.AccountantTask();
		
		Employe employee = new Employe();
		employee.EmployeeTask();
	}
}

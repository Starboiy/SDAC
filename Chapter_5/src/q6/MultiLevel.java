package q6;

class CEO{
	
	void WorkAssigning() {
		System.out.println("task for accountant");
	}
}

class Accountants extends CEO{
	
	@Override
	void WorkAssigning() {
		// TODO Auto-generated method stub
		super.WorkAssigning();
	}
	
	double Calsal(double sal) {
		return sal;
	}

	
	
}

class Employees extends Accountants{
	
	void Task() {
		System.out.println("Lot of work");
	}

	@Override
	double Calsal(double sal) {
		// TODO Auto-generated method stub
		return super.Calsal(sal);
	}
	

}


public class MultiLevel {

	public static void main(String[] args) {
		 
		Accountants accountant = new Accountants();
		accountant.WorkAssigning();
		
		Employees employee = new Employees();
		System.out.println(employee.Calsal(1000));
		employee.Task();
	}
}

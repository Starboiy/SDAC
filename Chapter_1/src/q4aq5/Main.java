package q4aq5;


class Accountant{
	
	double Calsal(double sal) {
		return sal;
	}
	
	double Calsal(double sal,double bonus) {
		return sal+bonus;
	}
		
}

class Employee extends Accountant{	

	@Override
	double Calsal(double sal) {
		// TODO Auto-generated method stub
		return super.Calsal(sal);
	}
	

}

public class Main {

	public static void main(String[] args) {
		
		Accountant accountant = new Accountant();
		System.out.println(accountant.Calsal(100));
		
		Employee employee = new Employee();
		System.out.println(employee.Calsal(200,20));
		
		
	}
}

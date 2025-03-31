package q6;

class Accountant{
	
	double Calsal(double sal) {
		return sal;
	}
	
}

class Employee extends Accountant{
	
	void Task() {
		System.out.println("Lot of work");
	}

	@Override
	double Calsal(double sal) {
		// TODO Auto-generated method stub
		return super.Calsal(sal);
	}
	

}
public class Single {

	public static void main(String[] args) {
		 
		Employee employee = new Employee();
		System.out.println(employee.Calsal(1000));
		employee.Task();
	}
}

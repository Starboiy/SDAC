package q5;

class Accountant{
	
	String name ="Adi";
	
	double Calsal(double sal) {
		return sal;
	}
	
	public Accountant() {
		System.out.println("Constructor inside parent");
	}
	
}

class Employee extends Accountant{

	public Employee() {
			super();
	}
	
	void meth(double sal) {
		super.Calsal(sal);
		System.out.println(super.name);
	}
}

public class Main {

	public static void main(String[] args) {
		
		Employee employee =  new Employee();
		employee.meth(1000);
		
		
	
	}
}

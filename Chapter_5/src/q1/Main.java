package q1;

class Emp{
	
	final String Name = "Aditya";
	
	final void displayinfo() {
		System.out.println("This is final meth");
		// Name = "Boss";  The final field Emp.Name cannot be reinitialized
	}
}

final class Acc{
	
	double calsal(double sal) {
		return sal;
	};
	
}


 class Emp2 extends Emp{
	 
//	 void display() {} Cannot override the final method from Emp
 }

 
 
//class Manager extends Acc{

//	The type Manager cannot subclass the final class Acc i.e cannot be inherited
//}

public class Main {
 
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.displayinfo();
	}
}

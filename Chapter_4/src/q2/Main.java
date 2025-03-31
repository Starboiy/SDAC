package q2;

class Emp{
	
	String Name = "Aditya";
	
	public Emp(String name) {
		super();
		Name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("The Object is being deleted");
	}
 }

public class Main {

	public static void main(String[] args) {
		 
		Emp emp = new Emp("Aditya");
		
		emp = null;
		System.gc();
		System.out.println(emp);
	}
}

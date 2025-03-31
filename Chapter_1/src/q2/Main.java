package q2;

class Emp{
	
	String name;
	String address;
	
	static String dept;
	static String compname;
	
	void DisplayInfo() {
		
		System.out.println(name);
		System.out.println(address);
		
	}
	

	static void StaticDisplayInfo() {
		System.out.println(dept);
		System.out.println(compname);
		
	}
}


public class Main {

	public static void main(String args[]) {
		
		Emp emp = new Emp();
		emp.DisplayInfo();
		Emp.StaticDisplayInfo();
		
	}
}

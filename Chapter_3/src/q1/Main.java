package q1;


class Emp{
	
	String Name;
	int id;
	static String dept = "Software";
	static String Compname = "Google";
	
	
	public Emp(String name, int id) {
		super();
		Name = name;
		this.id = id;
	}
	
	void display1() {
		
		System.out.println(Name);
		System.out.println(id);
		
	}
	
	static void display2() {
		
		System.out.println(Emp.dept);
		System.out.println(Emp.Compname);
	}
	
}
public class Main {

	public static void main(String[] args) {
		
			Emp emp = new Emp("Adi", 1);
			
			emp.display1();
			Emp.display2();
	
		
	}
}

package q5;

class Emp{
	
	String Name = "Adi";
	static String Dept = "SDE";
	
	void display() {
		int id = 10;
		
		System.out.println(id);

	}
}
public class Main {

	public static void main(String[] args) {
		
		Emp emp  = new Emp();
		
		System.out.println(emp.Name);
		System.out.println(Emp.Dept);
		
		emp.display();
		
	}
}

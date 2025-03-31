package q2;

class Emp{

	String name;
	int id;
	float sal;
	String company;
	String dept;
	
	public Emp(String name, int id, float sal, String company, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.company = company;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", company=" + company + ", dept=" + dept + "]";
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		
		Emp emp = new Emp("Aditya", 1, 20000000, "Google", "SDE");
		
		System.out.println(emp);
		
	}
}

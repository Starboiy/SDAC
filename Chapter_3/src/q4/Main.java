package q4;


class Emp{
	
	private String name;
	private String Company;
	private	String Dept;
	private int id;
	private float sal;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setCompany("Apple");
		System.out.println(emp.getCompany());
		
	}
}

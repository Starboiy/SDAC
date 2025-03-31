package q3;

import java.util.Objects;

class Emp{
	
	String name ;
		
	@Override
	protected void finalize() throws Throwable {
	System.out.println("Object has been deleted");
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}

	public Emp(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(name, other.name);
	}
}
public class Main {
	
	public static void main(String[] args) {
		
		Emp a = new Emp("Aditya");
		Emp b = new Emp("Shinde");
		Emp c = new Emp("Aditya");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a);
		a= null;
		System.gc();
	}
	 

	
}

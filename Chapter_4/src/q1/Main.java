package q1;

class Hobbies{
	
}

class Address{
	
	String city;
	String state;
	int pincode;
	
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}

class Emp{

	String name;
	int id;
	Address address;
	Hobbies hobbies;
	public Emp(String name, int id, Address address, Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.hobbies = hobbies;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", address=" + address + ", hobbies=" + hobbies + "]";
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Address address = new Address( "Mumbai", "Maharashtra", 400091);
		Emp emp = new Emp( "Aditya", 1, address, null);
		
		System.out.println(emp);
	}
	
}

package q6;

class Hobbies {
	String Sports;

	public Hobbies(String sports) {
		super();
		Sports = sports;
	}

	@Override
	public String toString() {
		return "Hobbies [Sports=" + Sports + "]";
	}

}

class Address {

	String city;
	String State;

	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + "]";
	}

}

class Emp {

	int id;
	String name;
	Address address;
	Hobbies hobbies;

	public Emp(int id, String name, Address address, Hobbies hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", hobbies=" + hobbies + "]";
	}

}

public class Main {

	public static void main(String[] args) {

		Address address = new Address("Mumbai", "Maharashtra");
		Hobbies hobbies = new Hobbies("Cricket");
		Emp emp = new Emp(1, "Aditya", address, hobbies);

		System.out.println(emp);

	}
}

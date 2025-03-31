package q3.A;

public class A {
	
	public String a = "Public";
	private String b = "Private";
	protected String c = "Protected";
	String d = "Default";
	
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println("In Class A");
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		
		B b = new B();
		b.display1();
		
		C c = new C();
		c.display2();

	}

}

class B {
	
	void display1() {
		
		System.out.println("In Class B");
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}

class C extends A {
	
	void display2() {
		
		System.out.println("In Class C");
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.c);
		System.out.println(c.d);
	}
}

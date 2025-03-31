package q2;

class A{
	
		A obj() {
			
			System.out.println("Inside Class A, return type of meth is class A");
			return this;
		}
	
	
}

class B extends A{
	
		@Override
		B obj() {
			
			System.out.println("Inside Class B, return type of meth is class B");
			return this;
		}
}
public class Main {

	public static void main(String[] args) {
	
		A a = new A();
		a.obj();
		B b = new B();
		b.obj();
	}
}

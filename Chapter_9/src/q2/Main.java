package q2;

interface A{
	void A();
}

abstract class B{
	abstract void B() ;
	
}

class C{
// PASS CLASS AS A PARAMETER USING INNER CLASS
	
	void C(A a,B b) {
		
		a.A();
		b.B();
	}
	
}

public class Main {

	public static void main(String[] args) {
		C c = new C();
		c.C(new A() {
			
			@Override
			public void A() {
				System.out.println("A");
				
			}
		},new B() {
			
			@Override
			void B() {
				System.out.println("B");
				
			}
		});
	}
	
	
}

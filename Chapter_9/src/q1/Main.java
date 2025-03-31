package q1;
// ANONYMOUS CLASS

interface A{
	void methA();
}

abstract class B{
	abstract void methB();
}

class C{
	void methC() {
	}
	
}



public class Main{
	
	public static void main(String[] args) {
	
		A a = new A() {
			@Override
			public void methA() {
				// TODO Auto-generated method stub
				
			}
		}; 
		B b = new B() {
			
			@Override
			void methB() {
				// TODO Auto-generated method stub
				
			}
		};
		C c = new C() {
			@Override
			void methC() {
				// TODO Auto-generated method stub
				super.methC();
			}
		};
		
		a.methA();
		b.methB();
		c.methC();
	}
}
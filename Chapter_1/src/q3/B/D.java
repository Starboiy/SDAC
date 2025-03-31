package q3.B;

import q3.A.*;

public class D extends A{
	
	public static void main(String[] args) {
		
		D d = new D();
		
		System.out.println("Another Package");
		System.out.println(d.a);
		System.out.println(d.c);
		
		E e = new E();
		e.display3();
		
	}
	
}

class E extends q3.A.A{
	
	void display3() {
		
		E e = new E();
		
		System.out.println("Another Package another class");
		System.out.println(e.a);
		System.out.println(e.c);
	}
	
}
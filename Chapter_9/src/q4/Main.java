package q4;

import q4.Outter.Inner;

// STAIC INNER CLASS
class Outter {

	static private int a = 100;

	static class Inner {

		void meth1() {
			System.out.println("nonstatic" + a);
		}

		static void meth() {
			System.out.println("Static Inner class ka meth is used " + a);
		}
	}

}

public class Main {

	public static void main(String[] args) {

		Outter outter = new Outter();
		Outter.Inner inner = new Outter.Inner();

		Outter.Inner.meth();
		inner.meth1();
		Inner.meth(); // idher kyu error aara nahi malum?
	}
}

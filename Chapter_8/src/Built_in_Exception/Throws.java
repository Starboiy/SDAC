package Built_in_Exception;

import java.io.IOException;
import java.lang.Exception;

class A {

	IOException i = new IOException();

	void methA() throws IOException {
		throw i;
	}
}

class B {

	A a = new A();

	void methB() throws IOException {
		a.methA();
	}
}

public class Throws {
	public static void main(String[] args) {
		B b = new B();
		try {
			b.methB();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
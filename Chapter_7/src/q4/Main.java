package q4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Emp implements Cloneable {

	public String name;
	public int id;

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
}

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp = new Emp("Adi", 1);
		Emp clone = (Emp) emp.clone();
		System.out.println(emp);
		System.out.println(clone);

		Method method[] = emp.getClass().getMethods();

		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}

		Field field[] = emp.getClass().getFields();

		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i]);
		}

		Constructor constructor[] = emp.getClass().getConstructors();
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}
	}
}

package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp> {
	String name;
	int age;
	double sal;
	public Emp(String name, int age, double sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Emp o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age > o.age) {
			return 1;
		}
		return 0;
		
	}
}
public class Main {
	public static void main(String[] args) {
		Emp emp1 = new Emp("Aditya", 50, 4500);
		Emp emp2 = new Emp("Aakash", 51, 22000);
		Emp emp3 = new Emp("Anant", 79, 12000);
		Emp emp4 = new Emp("Harsh", 22, 67000);
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		System.out.println("before");
		Iterator<Emp> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
		}

		Collections.sort(emps);

		System.out.println("after");
		Iterator<Emp> iterator2 = emps.iterator();
		while (iterator2.hasNext()) {
			Emp emp = (Emp) iterator2.next();
			System.out.println(emp);
		}
		
		
		Collections.sort(emps, new AgeComparator());
		Iterator<Emp> iterator3 = emps.iterator();
		while (iterator3.hasNext()) {
			Emp emp = (Emp) iterator3.next();
			System.out.println(emp);
		}
		
	}
}

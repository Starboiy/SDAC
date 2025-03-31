package Arraylist;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationImp implements Operation {

	List<EmpPojo> db = new ArrayList<EmpPojo>();

	@Override
	public void insertData(List<EmpPojo> list) {

		db.addAll(list);
		System.out.println("data inserted.....");

	}

	@Override
	public void updateData(int id, String name) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();

			if (empPojo.getId() == id) {
				empPojo.setName(name);
				System.out.println("data updated....");
			}

		}
	}

	@Override
	public void deteleData(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();

			if (empPojo.getId() == id) {
				iterator.remove();
				System.out.println("data deleted...");
			}

		}
	}

	@Override
	public void search(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();

			if (empPojo.getId() == id) {
				System.out.println(empPojo);
				System.out.println("found");
			}

		}
	}

	@Override
	public void showData() {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);
		}
	}

}
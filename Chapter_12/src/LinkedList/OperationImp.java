package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;

public class OperationImp implements Operation {
    LinkedList<EmpPojo> db = new LinkedList<EmpPojo>();

    @Override
    public void insertData(LinkedList<EmpPojo> list) {
        db.addAll(list);
        System.out.println("data inserted.....");
    }

    @Override
    public void updateData(int id, String name) {
        ListIterator<EmpPojo> listIterator = db.listIterator();
        while (listIterator.hasNext()) {
            EmpPojo empPojo = listIterator.next();
            if (empPojo.getId() == id) {
                empPojo.setName(name);
                System.out.println("data updated....");
            }
        }
    }

    @Override
    public void deteleData(int id) {
        ListIterator<EmpPojo> listIterator = db.listIterator();
        while (listIterator.hasNext()) {
            EmpPojo empPojo = listIterator.next();
            if (empPojo.getId() == id) {
                listIterator.remove();
                System.out.println("data deleted...");
            }
        }
    }

    @Override
    public void search(int id) {
        ListIterator<EmpPojo> listIterator = db.listIterator();
        while (listIterator.hasNext()) {
            EmpPojo empPojo = listIterator.next();
            if (empPojo.getId() == id) {
                System.out.println(empPojo);
                System.out.println("found");
                return;
            }
        }
        System.out.println("Employee not found");
    }

    @Override
    public void showData() {
        ListIterator<EmpPojo> listIterator = db.listIterator();
        while (listIterator.hasNext()) {
            EmpPojo empPojo = listIterator.next();
            System.out.println(empPojo);
        }
    }
}
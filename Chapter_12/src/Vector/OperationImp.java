package Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class OperationImp implements Operation {
    Vector<EmpPojo> db = new Vector<EmpPojo>();

    @Override
    public void insertData(Vector<EmpPojo> vector) {
        db.addAll(vector);
        System.out.println("data inserted.....");
    }

    @Override
    public void updateData(int id, String name) {
        Enumeration<EmpPojo> enumeration = db.elements();
        while (enumeration.hasMoreElements()) {
            EmpPojo empPojo = enumeration.nextElement();
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
            EmpPojo empPojo = iterator.next();
            if (empPojo.getId() == id) {
                iterator.remove();
                System.out.println("data deleted...");
            }
        }
    }

    @Override
    public void search(int id) {
        Enumeration<EmpPojo> enumeration = db.elements();
        while (enumeration.hasMoreElements()) {
            EmpPojo empPojo = enumeration.nextElement();
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
        Enumeration<EmpPojo> enumeration = db.elements();
        while (enumeration.hasMoreElements()) {
            EmpPojo empPojo = enumeration.nextElement();
            System.out.println(empPojo);
        }
    }
}
  

   
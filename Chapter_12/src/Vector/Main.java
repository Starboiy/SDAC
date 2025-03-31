package Vector;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        EmpPojo empPojo1 = new EmpPojo(1, "Aditya", "Borivali");
        EmpPojo empPojo2 = new EmpPojo(2, "Tejas", "Kandivali");
        EmpPojo empPojo3 = new EmpPojo(3, "Arjun", "Charkop");
        EmpPojo empPojo4 = new EmpPojo(4, "Rahul", "Naigaon");
        
        Vector<EmpPojo> vector = new Vector<EmpPojo>(); 
        vector.add(empPojo1);
        vector.add(empPojo2);
        vector.add(empPojo3);
        vector.add(empPojo4);
        
        OperationImp imp = new OperationImp();
        
        imp.insertData(vector);
        imp.showData();
        imp.updateData(3, "Dad");
        imp.showData();
        imp.deteleData(3);
        imp.showData();
        imp.search(35);
    }
}
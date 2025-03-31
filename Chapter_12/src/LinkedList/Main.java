package LinkedList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        EmpPojo empPojo1 = new EmpPojo(1, "Aditya", "Borivali");
        EmpPojo empPojo2 = new EmpPojo(2, "Tejas", "Kandivali");
        EmpPojo empPojo3 = new EmpPojo(3, "Arjun", "Charkop");
        EmpPojo empPojo4 = new EmpPojo(4, "Rahul", "Naigaon");
        
        LinkedList<EmpPojo> list = new LinkedList<EmpPojo>(); 
        list.add(empPojo1);
        list.add(empPojo2);
        list.add(empPojo3);
        list.add(empPojo4);
        
        OperationImp imp = new OperationImp();
        
        imp.insertData(list);
        imp.showData();
        imp.updateData(3, "Dad");
        imp.showData();
        imp.deteleData(3);
        imp.showData();
        imp.search(35);
    }
}
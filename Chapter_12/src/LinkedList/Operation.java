package LinkedList;

import java.util.LinkedList;

public interface Operation {

    void insertData(LinkedList<EmpPojo> list);

    void updateData(int id, String name);

    void deteleData(int id);

    void search(int id);

    void showData();
}
package Vector;

import java.util.Vector;

public interface Operation {

    void insertData(Vector<EmpPojo> list);

    void updateData(int id, String name);

    void deteleData(int id);

    void search(int id);

    void showData();
}
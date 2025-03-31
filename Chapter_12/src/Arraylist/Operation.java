package Arraylist;


import java.util.List;

public interface Operation{

	void insertData(List<EmpPojo> list);

	void updateData(int id, String name);

	void deteleData(int id);

	void search(int id);

	void showData();

}

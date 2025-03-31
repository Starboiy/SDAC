package pack1;
import com.hospital.staff.doctor.salary.Salary;
public class Main extends Salary {

	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main.calSalary(1200, 1199));
		
		Nurse nurse = new Nurse();
		nurse.meth();
	}
}

class Nurse extends com.hospital.staff.doctor.salary.Salary{
	
	
	void meth() {
		Nurse nurse = new Nurse();
		System.out.println(nurse.calSalary(13000, 12));
	}
	
}

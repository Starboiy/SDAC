package q3;

class SBI {

	float getROI() {
		return 0;
	}
}

class Axis extends SBI {

	@Override
	float getROI() {
		// TODO Auto-generated method stub
		return 1.8f;
	}
}

class ICICI extends SBI {
	@Override
	float getROI() {
		// TODO Auto-generated method stub
		return 2.5f;
	}
}

class BOB extends SBI {

	@Override
		float getROI() {
			// TODO Auto-generated method stub
			return 3.7f;
		}
}
public class Main {

	public static void main(String[] args) {

		SBI sbi;

		sbi = new Axis();
		System.out.println("ROI of Axis is " + sbi.getROI());
		sbi = new BOB();
		System.out.println("ROI of BOB is " + sbi.getROI());
		sbi = new ICICI();
		System.out.println("ROI of ICICI is " + sbi.getROI());
	}
}

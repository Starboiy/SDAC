package q1;

interface Policy{

	void setCompanyPolicy();
}

abstract class Company implements Policy{
	@Override
	public void setCompanyPolicy() {
		System.out.println("Policy");
		
	}
	
	abstract void calsal();
}

class Accountant extends Company{
	
	@Override
	void calsal() {
		System.out.println("Salary");
		
	}
}
public class Main {
	
	public static void main(String[] args) {
		
	Accountant accountant = new Accountant();
	accountant.calsal();
	accountant.setCompanyPolicy();
	}
}

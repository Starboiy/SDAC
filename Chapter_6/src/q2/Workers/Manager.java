package q2.Workers;

import q2.Accountant.*;

public class Manager extends Accountant{

	@Override
	public double calsal(double sal,double bonus) {
		return sal+bonus;
	}
}
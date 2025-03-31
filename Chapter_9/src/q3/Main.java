package q3;
// SIMPLE INNER CLASS
class Outter{
	
	private int a =100;
		
			class Inner{
				void meth() {
					System.out.println("Inner class ka meth is used "+ a );
			}
		}
		
}
public class Main {
	
	public static void main(String[] args) {
		
		Outter outter = new Outter();
		Outter.Inner inner = outter.new Inner();
		inner.meth();
	}

}

package q5;
// LOCAL INNER CLASS
class Outer{
	
	void meth1(){
		
		final int a= 10;
			
			class Inner{
				
				void meth2() {
					
					System.out.println("this is local inner class ka method " + a);
					
				}
			}
			
			Inner inner = new Inner();
			inner.meth2();
	}
}

public class Main {
	
 public static void main(String[] args) {
	
	 Outer outer = new Outer();
	 outer.meth1();
}

}

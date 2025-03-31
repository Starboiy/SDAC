package Built_in_Exception;

public class Finally {

	public static void main(String[] args) {
		
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		
		try {
			int a[] = new int[5];
			a[6]=10;
			
		}
		finally {
			
			System.out.println("Yo");
		}
	}
}

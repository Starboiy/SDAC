package Built_in_Exception;

// TRY CATCH EXCEPTION
public class TryCatch {

	public static void main(String[] args) {

		try {
			int data = 20 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			int A[] = new int[10];
			A[11] = 10;
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			String i = null;
			System.out.println(i.length());
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			String a = "abc";
			int i = Integer.parseInt(a);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

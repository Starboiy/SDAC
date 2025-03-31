package q1;

public class Main {

	public static void main(String[] args) {
		
		String s1 = "Aditya";
		String s2 = "  Shinde  ";
		
		// Length of 
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//Compare to
		System.out.println(s1.compareTo(s2));
		
		//Concatenate
		System.out.println(s1.concat(s2));
		
		//Trim
		System.out.println(s2.trim());
		
		//Replace
		System.out.println(s1.replace("Adi", "Go"));
		
		//Value of
		int a = 20;
		
		String s3 = String.valueOf(a);
		System.out.println(s3+25);
		
		// Wrapper Class
				int b = 20;
				Integer i = b;
				
				int t = i;
				
				System.out.println(i);
				System.out.println(t);
		
	}
}


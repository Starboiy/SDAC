package User_Defined;



public class Main {
	
	static void checkAge(int age) throws InvalidAgeException{

		if(age < 18) {
			System.out.println("You cant Vote");
		}
		else {
			System.out.println("You can Vote");
		}
	}
	
	public static void main(String[] args) {
     
       int age = 17;

        try {
            checkAge(age); 
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

       
    }
}

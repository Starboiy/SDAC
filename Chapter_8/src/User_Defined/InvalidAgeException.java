package User_Defined;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Pass the message to Exception class
    }
}
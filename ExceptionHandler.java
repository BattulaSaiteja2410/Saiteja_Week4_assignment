package XenosisWeek4;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandler {
    public static void main(String[] args) {
        try {
           
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2; 

            String name = null;
            System.out.println(name.length());

            int age = -5;
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative"); 
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
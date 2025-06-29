package Exceptions;

public class TryandCatch {
    public class ExceptionDemo {

        // This method declares that it may throw an exception
        public static int divide(int a, int b) throws ArithmeticException {
            return a / b; // Might throw ArithmeticException if b == 0
        }

        public static void main(String[] args) {
            try {
                int result = divide(10, 0); // This will throw an exception
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }

            System.out.println("Program continues after exception handling.");
        }
    }

}
//Keyword	Purpose
//throws	Used in method declaration to signal it may throw a checked/unchecked exception.
//try-catch	Used to handle the exception at runtime, so the program doesn't crash.
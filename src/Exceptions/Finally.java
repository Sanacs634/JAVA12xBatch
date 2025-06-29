package Exceptions;
//✅ What is finally in Java?
//The finally block is used to execute important code such as:
//
//Closing resources
//
//Cleaning up
//
//Ensuring code runs regardless of exceptions
//
//It always runs after try and catch, even if:
//
//An exception is thrown
//
//No exception is thrown
//
//The method returns early
public class Finally {
    public class FinallyDemo {
        public static void main(String[] args) {
            try {
                int a = 10, b = 0;
                int result = a / b; // This will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } finally {
                System.out.println("This is the finally block. It always executes.");
            }

            System.out.println("Program continues after try-catch-finally.");
        }
    }

}

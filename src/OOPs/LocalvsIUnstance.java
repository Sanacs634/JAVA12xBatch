package OOPs;
//Feature	             Instance Variable	                             Local Variable
//Where it's declared	 Inside a class, outside any method or block	Inside a method, constructor, or block
//Scope	Available        to all methods of the class	                Available only within the method/block it is declared in
//Memory Location	     Stored in the heap (as part of the object)	    Stored in the stack
//Default Value	         Gets a default value (e.g., 0, null, false)	Must be explicitly initialized before use
//Lifespan	             Lives as long as the object exists	            Lives only during method/block execution
//Access Modifiers	     Can have private, public, etc.	                Cannot have access modifiers

public class LocalvsIUnstance {
    static class Person {
        // Instance variable
        String name;  // belongs to the object

        public void sayHello() {
            // Local variable
            String greeting = "Hello"; // only exists inside this method
            System.out.println(greeting + ", my name is " + name);
        }

        public static void main(String[] args) {
            Person p = new Person();
            p.name = "Alice"; // assigning instance variable
            p.sayHello();
        }
    }
}

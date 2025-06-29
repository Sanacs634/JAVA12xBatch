package Abstraction;
//An interface is a fully abstract blueprint of a class. It only declares methods — implementation must be provided by classes that implement the interface.
public class Interface {
    interface Animal {
        void makeSound(); // Implicitly public and abstract
    }

    class Dog implements Animal {
        public void makeSound() {
            System.out.println("Bark");
        }
    }

}
//Feature	                Abstract Class	              Interface
//Can have method body?	    Yes (abstract + concrete)	  Yes (default/static only in Java 8+)
//Fields	                Can have instance variables	  Only public static final (constants)
//Multiple inheritance	    Not allowed	                  Allowed (multiple interfaces)
//Constructors	            Yes	                          No
//Usage	                    "Is-a" relationship	          "Can-do" or "implements" behavior



//✅ When to Use What?
//Scenario	Use
//You want to share code across several related classes	🟩 Abstract Class
//You want to define capabilities for unrelated classes	🟦 Interface
//You need to implement multiple behaviors	🟦 Interface
//You want to use default behavior + enforce rules	🟩 Abstract Class (and maybe Interface too)
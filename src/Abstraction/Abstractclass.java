package Abstraction;
//An abstract class is a class that cannot be instantiated (you can't create objects from it). It is designed to be inherited by other classes.
//
//It can:
//
//Have abstract methods (no body)
//
//Have concrete methods (with implementation)
//
//Have fields, constructors, and access modifiers
public class Abstractclass {
    abstract class Animal {
        abstract void makeSound(); // Abstract method

        void eat() {
            System.out.println("Eating food..."); // Concrete method
        }
    }

    class Dog extends Animal {
        void makeSound() {
            System.out.println("Bark"); // Implementation of abstract method
        }
    }

}

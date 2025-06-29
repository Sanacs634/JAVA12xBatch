package Encapsulation;
//The super keyword in object-oriented programming (used in languages like Java, C++, and C#) is used to refer to the parent class (also called the superclass). It is commonly used to:
//
//Access superclass methods that have been overridden.
//
//Access superclass constructors.
//
//Access superclass fields if they are hidden in the subclass.
public class SuperKeyword {
    static class Animal {
        String name = "Animal";

        void sound() {
            System.out.println("Animal makes a sound");
        }

        Animal() {
            System.out.println("Animal constructor called");
        }
    }

   static class Dog extends Animal {
        String name = "Dog";

        Dog() {
            super(); // Calls the Animal constructor
            System.out.println("Dog constructor called");
        }

        void printNames() {
            System.out.println("Subclass name: " + name);
            System.out.println("Superclass name: " + super.name); // Access parent field
        }

        void sound() {
            super.sound(); // Calls the Animal version of sound()
            System.out.println("Dog barks");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.printNames();
            d.sound();
        }
    }

}

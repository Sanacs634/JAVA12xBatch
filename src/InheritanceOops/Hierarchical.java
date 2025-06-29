package InheritanceOops;

public class Hierarchical {
 static   class Animal {
        void sound() {
            System.out.println("Animal makes a sound.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks.");
        }
    }

    static  class Cat extends Animal {
        void meow() {
            System.out.println("Cat meows.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();
            d.bark();

            Cat c = new Cat();
            c.sound();
            c.meow();
        }
    }

}

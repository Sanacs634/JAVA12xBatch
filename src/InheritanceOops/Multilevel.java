package InheritanceOops;

public class Multilevel {
   static class Animal {
        void eat() {
            System.out.println("Animal eats.");
        }
    }

   static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks.");
        }
    }

  static  class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy weeps.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Puppy p = new Puppy();
            p.eat();  // from Animal
            p.bark(); // from Dog
            p.weep(); // from Puppy
        }
    }

}

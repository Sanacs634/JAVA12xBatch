package InheritanceOops;

public class SingleLevel {
    static class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();  // inherited from Animal
            dog.bark(); // defined in Dog
            //Dog dog1 = new Animal();//this is not possible as animal doest have any attributes of dog and it will get complite time error
            Animal dog2 = new Dog();//This is possible
            dog2.eat();//ok
            //dog2.bark();it is a method of child only not parent
        }
    }

}

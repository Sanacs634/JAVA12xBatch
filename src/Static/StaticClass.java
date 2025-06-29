package Static;
//In Java:
//
//Top-level classes (classes declared directly inside a .java file) cannot be static.
//
//Only nested (inner) classes can be declared static.
//
//A static nested class does not require an instance of the outer class to be created.

class Outer {
    static class StaticNested {
        void display() {
            System.out.println("Inside static nested class.");
        }
    }

    void outerMethod() {
        System.out.println("Inside outer class method.");
    }
}



public class StaticClass {
    public static void main(String[] args) {
        // Create an object of the static nested class directly
        Outer.StaticNested nestedObj = new Outer.StaticNested();
        nestedObj.display();

        // To call the outer class's method
        Outer outerObj = new Outer();
        outerObj.outerMethod();
    }
}


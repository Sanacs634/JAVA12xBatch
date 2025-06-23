package String;
//- **Sequence of Characters **or Bunch of Characters.
//        - e.g ->. 'a' -> char , "ab" -> Strings.
//- Non Primitive data Types (User Defined).
//        - String is a **Built-In** in **java.lang.**String package - provided by the Java Guys.
//- String is **final class**. ( You can't have a children).  - Inherited.

//### ⚠️ **Immutable vs Mutable**
//#### *** Mutable -  **Can change
//#### *** Immutability - **That can't be change.

//#### How Strings are Stored in the JVM?
//1. String Constant Pool
//2. Heap Area ( Object)
//
//
//#### How to create the strings in Java?
//- String name = "Pramod"; -> String Constant Pool
//- String name2 = new String("Pramod"); -> Heap Area ( Object)



public class Lab001StringBasics {
    public static void main(String[] args) {
        String name = "Sana";//it gets stored in String Constant Pool
        name.toUpperCase();
        System.out.println(name);// here it prints the lower case if it was an integer like primitives it would have changed
        // but since string is immutable it doest get changed but creates a newuppercase name in the pool if wee need to access it we need to store them


    }



}

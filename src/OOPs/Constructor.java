package OOPs;
//## **OOPs - Constructor**
//
//
//- Constructor is a **special method** which is invoked automatically at the time of** object creation.**
//- It is used to **initialize the data members** (attributes) of new objects generally.
//- Constructors have the **same name as class or structure. **
//- Constructors don’t have a return type. (Not even void)
//- Constructors are only called once, at **object creation.**
//
//
//**Types of Constructors**
//
//1. Default
//2. Parametrised
//### **Default ****constructor**** | ****Non-Parameterized constructor**** : **
//- **A constructor which has no argument** is known as non-parameterized constructor(or no-argument constructor).
//- It is invoked at the time of creating an object.
//- If we don’t create one then it is created by default by Java.  but it is empty.
//    ### **Parameterized constructor**** : **
//            - Constructor which has parameters is called a parameterized constructor.
//- It is used to provide different values to distinct objects.

public class Constructor {
    public static void main(String[] args) {
        Baby munnu = new Baby();
        System.out.println(munnu.name);//here null is assigneeed by the contructor
    }
    static class  Baby{
        String name;

        public Baby() {
        }

    }
}

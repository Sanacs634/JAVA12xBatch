package ObjectClass;
//- Class Object is the **root of the class hierarchy**.
//- Every class has Object as a superclass.
//- All objects, including arrays, implement the methods of this class.
//
//
//- **toString() Method**
//- hashCode()
//- **equals()**
//- finalize()
//- getClass()
//- clone()
//- **wait() Method**
//**Causes the current thread to wait **until another thread invokes notify() or notifyAll() on this object.
//- **notify() Method**
//**Wakes up a single thread** waiting on this object's monitor.
//- **notifyAll() Method**
//**Wakes up all threads waiting** on this object's monitor
public class BasicIdea {


    public class Sample extends Object{


        @Override
        public String toString() {
            System.out.println("This is coming from Object? class");
            return null;

        }

        @Override
        public int hashCode() { // Ashkot, I will explain to you in the collection framework.
            System.out.println(" coming from the object. ");
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            System.out.println(" This is also coming from the object class. ");
            return true;
        }
    }
}

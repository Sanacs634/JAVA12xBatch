package Wrapper;
//Problem with **Primitive Data Types. ?**
//
//1. int, float, short, char, double , boolean -> primitive -> **They are not Objects. **
//2. They don't have method, attribute?
//3. Java likes - Class and Object.

//### **Wrapper Class**
//- A **wrapper class** in programming is a class that encapsulates or "wraps" a primitive data type into an object.
//- Allowing primitive types to be treated as objects.
//    - Attribute
//    - Behaviour
//- **Collection Framework **-> Objects. (Collection Framework doesn't work with Primitive Data Types).
//- They convert **primitive data types into objects.**
//- A Wrapper class is a class whose object wraps or contains primitive data types.
public class BasicDefinition {
    public static void main(String[] args) {
        int a =10;
        Integer b = a; //AutoBoxing is converting primitive to Wrapper by JVM

        Integer aa = b;
        int c = aa;//Unboxing - converting wrapper class to primitive
        Integer a1 = new Integer(0);//// Valid, but not recommended in modern Java
        Integer a2 = Integer.valueOf(0); // Better: uses internal caching
    }

}
//We dont have wrapperclass for string because its always a class from beginning

//```
//- Using valueOf() -> String to Wrapper -
//- using parseXO(); ->. String to Primitive, String to Wrapper
//- Wrapper -> String-> toString()
//```

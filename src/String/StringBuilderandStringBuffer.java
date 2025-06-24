package String;
//Disadvantage of using a **String Class - Immutable in nature. - By Default - Java -> **String Class (C)
//
//
//
//- StringBuilder(C) and StringBuffer(C) are classes that provide mutable sequences of characters.
//- They are designed for efficient **string manipulation operations, such as appending, inserting, or deleting characters from a string.**
//- The main difference between StringBuilder and StringBuffer is that **StringBuilder is not thread-safe**, while _**StringBuffer is thread-safe.(slow).**_
//- **StringBuilder is faster** and more efficient in single-threaded environments, while **StringBuffer is safer to use in multi-threaded environments.**
public class StringBuilderandStringBuffer {
    public static void main(String[] args) {
        //### **StringBuffer in Java: All Functions with Examples**
        //`StringBuffer` in Java is a **mutable** sequence of characters, meaning it can be modified without creating new objects (unlike `String`). It is **synchronized**, making it thread-safe. Below are its key functions with examples.
        StringBuffer string1 = new StringBuffer();
        StringBuilder string2 = new StringBuilder();

    }
}

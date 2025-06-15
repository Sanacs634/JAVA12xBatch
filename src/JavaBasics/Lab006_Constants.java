package JavaBasics;
//- Special variable whose **value can't be modified during the program execution.**
//- One created and SET THE VALUE , we will not able to modify.
//- PI - 3.14 , this value should be change during the execution of the program.
//- Constant is also called as **final** variable.
//### Why it required?
//1. Constants - they should be final in nature.
//- Value of the **final variable can not** be changed.
//
//If you try to change the value - `java: cannot assign a value to final variable PI`

import org.w3c.dom.ls.LSOutput;

public class Lab006_Constants {
    public static void main(String[] args) {
        final int a = 10;
        System.out.println(a);
        //a= 10; Will get error
    }

    //int a= 5; This will throw error





}

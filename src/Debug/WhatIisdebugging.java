package Debug;
//## **Debug** a Program in Java
//- Step by Step execution to see the results.
//- To find the issues(we can run the program line by line).
//- Rule -> Add **breaking point** (red) by clicking on the number -> **condition.**
//- [﻿www.jetbrains.com/help/idea/using-breakpoints.html?keymap=Windows](https://www.jetbrains.com/help/idea/using-breakpoints.html?keymap=Windows)
public class WhatIisdebugging {
    public static void main(String[] args) {
        int i = 11;

        i = i++ + ++i;

        // i = 11 then after increment i value becomes 12
        //then it added with an increment where i becomes 13 so
        //11+13=24

        System.out.println(i);
    }

}

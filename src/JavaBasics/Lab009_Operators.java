package JavaBasics;
//- An operator is a special symbol.
//- Tells the compiler to perform specific mathematical or logical operations on **operands**.
//- Operators are used to perform operations by using operands.(variable names) -> age.
//
//
//There are three types of operator depending on the number of operands required
//
//1. Unary Operator
//2. Binary Operator
//3. Ternary Operator

public class Lab009_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        a = +a; //unary
        c = a+b;
        boolean d = (a > b)?true:false;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

    }
}

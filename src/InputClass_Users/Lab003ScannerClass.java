package InputClass_Users;
//#### **Scanner class**
//        - Class, it  has a inbuilt method like nextInt, , next, nextFloat.
//-  These inbuilt methods can be used to basically get an input from a user and assign directly into their respective data types.
//        - `You can use the Scanner class; it's an inbuilt class provided by Java. You have to create the object by using the new operator. The moment you use it, you can directly use their functions to get input from a user.`
//        -

import java.util.Scanner;
// 1. Different Purposes
//nextInt() reads only an integer (it stops reading when it hits whitespace like a space or newline).
//
//nextLine() reads a full line of text — until the user presses Enter.
public class Lab003ScannerClass {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner useroutput = new Scanner(System.in);
        System.out.println("Enter your age");
        age = useroutput.nextInt();
        //We need to use nextline everytime we switch from integer to string as not it takes the newline by int and nextline guesses that this is the output it needs
        //useroutput.nextLine();

         System.out.println("Enter your name");
        name = useroutput.nextLine();
        System.out.println("Programends");
    }
}

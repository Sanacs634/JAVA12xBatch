package Task;

import java.util.Scanner;

public class Task21_ReverseStringBuffer {


    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String reverseword = word.next();
        String reverse =Revereofastring(reverseword);
        System.out.println(reverse);

    }

    static String Revereofastring(String rvrword){
        StringBuffer reversestring =new StringBuffer(rvrword);
        return reversestring.reverse().toString();
    }

}


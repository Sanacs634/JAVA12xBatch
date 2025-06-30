package Task;

import java.util.Scanner;

public class Task022reversestringrecursivefunctions {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String word = userinput.next();
        int length = lengthofString(word);
        reverseofastring(word,length);
        System.out.println(word);
    }

    static int lengthofString(String word1){
        int  count=0;
        try {
            while(true){
                word1.charAt(count);
                count++;
            }
        } catch (Exception e) {

        }
       return count;
    }
    static void reverseofastring(String word2, int ln){
        if(ln>0){
            System.out.print(word2.charAt(ln-1));
            ln--;
            reverseofastring(word2,ln);
        }
    }
}

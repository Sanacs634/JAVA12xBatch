package Task;

import java.util.Scanner;

public class Task017ReverseStringwithoutInbuilt {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the string");
        if(userinput.hasNext()){
            String word = userinput.next();
            int lengthofword = lengthofastring(word);
            reverseofastring(lengthofword,word);
        }else {
            System.out.println("Invalid Entry");
        }

    }


    static int lengthofastring(String strword) {
        int length = 0;
        try {
            while (true) {
                strword.charAt(length);
                length++;
            }

        } catch (IndexOutOfBoundsException e) {

        }
        return length;
    }





    static void reverseofastring(int lnword, String reverseword){
        int i =lnword-1;
        while(i>=0){
            System.out.print(reverseword.charAt(i));
            i--;
        }

    }
}

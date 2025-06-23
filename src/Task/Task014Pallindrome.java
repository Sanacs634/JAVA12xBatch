package Task;

import java.util.Scanner;

public class Task014Pallindrome {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a String");
        if (userinput.hasNext()) {
            String pallindromeword = userinput.next();
            int lengthofString = length_of_string(pallindromeword);
            //System.out.println(lengthofString);
            Pallindromofstring(lengthofString,pallindromeword);

        } else {
            System.out.println("Inavalid entry");
        }

    }






    static int length_of_string(String word) {
        int  length = 0;
        try {
           while(true) {
                char charofstringln = word.charAt(length);
                //System.out.println(charofstringln);
                length++;

            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return length;

    }
    static void Pallindromofstring(int lngofstr , String word){
        boolean isPallindrome = true;
        for(int i =0; i<lngofstr/2; i++){//here we are checking till the mid, if its an even number the mid will be already covered ,even if its an odd its the mid wont be covered but it wont affects its symmetry
            if(word.charAt(i)!=word.charAt(lngofstr-1-i)){
                isPallindrome = false;
                break;
            }
        }
        if(isPallindrome==true){
            System.out.println("Its a pallindrome");

        }else{
            System.out.println("Its not a pallindrome");
        }
    }


}


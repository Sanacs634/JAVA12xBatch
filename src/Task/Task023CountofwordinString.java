package Task;

import java.lang.classfile.instruction.CharacterRange;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task023CountofwordinString {
    public static void main(String[] args) {
        String word = inputword();
        //System.out.println("The count of words using replaceallfunction is  " + CountnofwordusingReplaceall(word));
        //System.out.println("The count of words using splitfunction is  " + noofwordsusingSplit(word));
        System.out.println("The count of words using scannerfunctionfunction is  " + CountnofwordusingReplaceall(word));


    }
    static String inputword(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a string");
        String word =userinput.nextLine();
        return word;
    }

    static int CountnofwordusingReplaceall(String Countword) {
        String trimmedword = Countword.trim();
        if(trimmedword.equals("")){
            return 0;
        }
        String wordwithonespae = trimmedword.replaceAll("\\s+", " ");
        int j = 0, countofword = 0;
        int lnofWordtobecount = wordwithonespae.length();
        while (j < lnofWordtobecount) {
            if(wordwithonespae.charAt(j)==' ')
            {countofword++;
            }
            j++;
        }
        return countofword+1;
    }

    static int noofwordsusingSplit(String Countwordusingsplit){
        String trimmedword = Countwordusingsplit.trim();
        if(trimmedword.equals("")){
            return 0;
        }
        String splitword[] = trimmedword.split("\\s+");
        int length = splitword.length;
        return length;
    }

    static int noofworusingScanner(String wordusingscanner){
        int wordcount=0;
        Scanner uinput = new Scanner(wordusingscanner);
        while(uinput.hasNext()){
            uinput.next();
            wordcount++;
        }return wordcount;
    }

}


package Task;

import java.util.Scanner;

public class Task018Amstrongnumber {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the number");
        if(userinput.hasNextInt()){
            int amsnumber = userinput.nextInt();
            int countofword = numberofdigits(amsnumber);
            amstrongnumber(countofword,amsnumber);

        }else{
            System.out.println("invalid entry");
        }
    }
    static int numberofdigits(int word){
        int count=0;
        while(word>0){
            word = word/10;
            count++;
        }
        return count;
    }
    static  void amstrongnumber(int lnword, int amword){
        int amsum = 0;
        int checkdigit = amword;

        while(amword>0){
            int digit =amword%10;
            int newdigit = amword/10;
            amword = newdigit;
            amsum = amsum + (int)Math.pow((digit),(lnword));

        }
        if(amsum==checkdigit){
            System.out.println("Is an amstrong");
        }else{
            System.out.println("Not an amstrong");
        }
    }
}
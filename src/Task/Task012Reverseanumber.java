package Task;

import java.util.Scanner;

public class Task012Reverseanumber {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        if(userinput.hasNextInt()){
            number = userinput.nextInt();
            if(number==0 || number< 0){
                System.out.println("We are looking for positive integer greater than zero");
            }else{
                int reversed_number =reverseofnumbermethod(number);
                System.out.println("The reversed number is "+ reversed_number);
            }
        }else{
            System.out.println("You are writing an incorrect value we are inspection only integer greater than zero");
        }
    }
    static int reverseofnumbermethod(int num){
        int rev =0;
        while(num>0){
            int lastdigit = num%10;
            rev = rev*10 + lastdigit;
            num = num/10;
        }
        return rev;
    }
}

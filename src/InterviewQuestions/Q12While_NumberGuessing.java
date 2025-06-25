package InterviewQuestions;

import java.util.Random;
import java.util.Scanner;



public class Q12While_NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        int numbertobegussed = random.nextInt( 100)+1;
        Scanner userinput = new Scanner(System.in);
        int guess,attempt=0;

        while(true){

            System.out.println("Enter the guess number between 1-10");
            attempt++;
            if(userinput.hasNextInt()){
                guess = userinput.nextInt();
                if (guess<0 || guess >100){
                    System.out.println("Enetre value is not in the specified range");
                }else{
                    if(guess==numbertobegussed){
                        System.out.println("Hurray you have found the number in " + attempt + "th attempt");
                        break;
                    }else if(numbertobegussed>guess){
                        System.out.println("The guessed number is less than the number to be guessed");
                    }else{
                        System.out.println("The guessed number is greater than the number to be guessed");
                    }
                }


            }else {
                System.out.println("Invalid Input");
            }



        }


    }
}

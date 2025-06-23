package Task;
//2 is the only even prime number.
//
//All other even numbers are divisible by 2, so not prime.
//
//A prime number has no divisors other than 1 and itself.

import java.util.Scanner;

public class Task15Primenumber {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the number");
        if(userinput.hasNextInt()){
            int Isprimenumber = userinput.nextInt();
            if(Isprimenumber<1){
                System.out.println("A prime number must be a positive integer greater than 1");

            }else if(Isprimenumber == 2){
                System.out.println("2 is the only even prime number");
            }else if(Isprimenumber%2==0){
                System.out.println("Its a prime number");
            }else
                System.out.println("its not a prime number");
        }else{
            System.out.println("Invalid Entry");
        }


    }
}

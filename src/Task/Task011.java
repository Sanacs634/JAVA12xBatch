package Task;

import java.util.Scanner;

//Factorial for n = user will enter the n from 0 to Max(int)
public class Task011 {
    public static void main(String[] args) {
        int number, factorial=1;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the number for the factorial(Only Integers)");
        if(userinput.hasNextInt()){
            number = userinput.nextInt();
                if(number<0){
                    System.out.println("it's a negative number and it doest have factorial");
                } else if (number>0) {
                    for (int i = 1; i<=number; i++){
                         factorial = factorial*i;

                    }
                    System.out.println("The factortial is " + factorial);;
                }else   {
                    System.out.println("The factotial is " + factorial);
                    }
                }else {
            System.out.println("You are writing a value other than integer");
        }




    }

}

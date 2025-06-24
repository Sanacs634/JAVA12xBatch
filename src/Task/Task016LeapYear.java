package Task;

import java.util.Scanner;

public class Task016LeapYear {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the year");
        if (userinput.hasNextInt()) {
            int IsLeapyear = userinput.nextInt();
            if((IsLeapyear%4==0&&IsLeapyear%100!=0) || (IsLeapyear%400==0)){
                System.out.println("its a leap year");
            }else{
                System.out.println("its not a leap year");
            }

        }else{
            System.out.println("Invalid Entry");
        }
            }
        }

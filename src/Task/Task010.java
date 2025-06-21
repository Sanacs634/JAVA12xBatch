package Task;

import java.util.Scanner;

//Write a Java program that takes a month number (1-12) and prints the number of days in that month using a switch statement. Handle February separately for leap years.
//a year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.
//Input -> 1 to 12, and Year = 2025
//-> 1 and year 2025 -> 31 Days
//-> 2 and year 2025 -> 28 Days, ( 2025 leap)
public class Task010 {
    public static void main(String[] args) {
   int a;
   int year;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the month in numbers");
        if(userinput.hasNextInt()){
            a = userinput.nextInt();

            switch(a){
                case 1:
                    System.out.println("31 days");
                    break;
                case 2:
                    System.out.println("Enter the year");
                    if(userinput.hasNextInt()){
                        year = userinput.nextInt();
                        if( ((year%4==0)&&(year%100!=0)) || ( (year%400==0)) ){
                            System.out.println("its a leap year so its 29 days");
                        }else{
                            System.out.println("Its not a leap year 28 days");
                        }
                    }else{
                        System.out.println("Please enter the yer in integer");
                    }

                   break;
                case 3:
                    System.out.println("31 days");
                    break;
                case 4:
                    System.out.println("30 days");
                    break;
                case 5:
                    System.out.println("31 days");
                    break;
                case 6:
                    System.out.println("30 days");
                    break;
                case 7:
                    System.out.println("31 days");
                    break;
                case 8:
                    System.out.println("31 days");
                    break;
                case 9:
                    System.out.println("30 days");
                    break;
                case 10:
                    System.out.println("31 days");
                    break;
                case 11:
                    System.out.println("30 days");
                    break;
                case 12:
                    System.out.println("31 days");
                    break;
                default:
                    System.out.println("invalid entry of month is between 1-12");
            }
        }
        else{
            System.out.println("You are entering a wrong value");
        }
        userinput.close();

    }
}

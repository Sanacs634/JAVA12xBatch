package Task;
//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//
//A: 90-100
//
//B: 80-89
//
//C: 70-79
//
//D: 60-69
//
//F: 0-59

import java.util.Scanner;

public class Task20GradeCalculator {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the marks");
        if(userinput.hasNextInt()){
            int marks = userinput.nextInt();
            if(marks<0&&marks>100){
                System.out.println("Please enter a valid value between 0 and 100");
            }else if(marks>=0&&marks<60){
                System.out.println("F");
            }else if(marks>=60&&marks<69){
                System.out.println("D");
            }else if(marks>=70&&marks<80){
                System.out.println("C");
            }else if(marks>=80&&marks<90){
                System.out.println("B");
            }else if(marks>=90&&marks<=100){
                System.out.println("A");
            }
        }else{
            System.out.println("Invalid Input");
        }

    }
}
//Can also be done in this way
//String grade = switch (score) {
//    case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> "A";
//    case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 -> "B";
//    case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> "C";
//    case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 -> "D";
//    default -> "F";
//};
//System.out.println(grade);
package Task;

import java.util.Scanner;

//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
public class Task009 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        float triangle_side1 ,triangle_side2 , triangle_side3;
        System.out.println("The triangle length is measured as a float value");
        System.out.println("Enter the first side of triangle");
        triangle_side1 = userinput.nextFloat();
        System.out.println("Enter the second side of triangle");
        triangle_side2 = userinput.nextFloat();
        System.out.println("Enter the third side of triangle");
        triangle_side3 = userinput.nextFloat();


        if((triangle_side1==triangle_side2)&&(triangle_side2==triangle_side3)){
            System.out.println("its an equilateral triangle");

        }
        else if((triangle_side1!=triangle_side2)&&(triangle_side2!=triangle_side3)&&(triangle_side3!=triangle_side1)){
            System.out.println("its scalene triangle");
        }
        else{
            System.out.println("its an isosceles triangle" );
        }

    }
}

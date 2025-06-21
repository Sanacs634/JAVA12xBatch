package ConditionandLoop;
//## Switch Statements
//- Multiple Condition or statements.
//- Java switch statement executes **one statement **from **multiple conditions.**
//- ⚠️ Java **switch expressions** must be of** byte, short, int, long(with its Wrapper type), enums and String**.
//- Beginning with JDK7, it also works with enumerated types.
//-  **The value for a case** must be constant or literal. **Variables are not allowed.**
//
//
//#### Syntax - Switch statement
//switch(expression)
//
//`{`
//
//` // case statements`
//
//` // values must be of same type of expression`
//
//` case value1 : expression = value 1 -> `
//
//` // Statements`
//
//` break; // break is optional`
//
//` case value2 :`
//
//` // Statements`
//
//` break; // break is optional`
//
//`default:`
//
//`break;`
//
//`}`

import java.util.Scanner;

public class Lab002Switch {
    //If you are using default as the first statement in the switch, then the break keyword is mandatory.
    // If you are using default at the end, then it is not mandatory to use the break statement.
    //Above jdk we neednot use break in switch and we can use multiple cases in a single case
    public static void main(String[] args) {
        int num;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        if (userinput.hasNextInt()) {//when an integer is done only it enetrs the switch statement
            num = userinput.nextInt();

            switch (num) {

                case 1:
                    System.out.println("its Monday");
                    break;
                case 2:
                    System.out.println("its Tuesday");
                    break;
                case 3:
                    System.out.println("its Wenesday");
                    break;
                case 4:
                    System.out.println("its Thursday");
                    break;
                case 5:
                    System.out.println("its Friyayy ");
                    break;
                case 6:
                    System.out.println("its Saturday!!!");
                    break;
                case 7:
                    System.out.println("Its Sunday");
                    break;
                default:
                    System.out.println("Sorry wrong input");
                    break;

            }

        }
        else {
            System.out.println("Your are entering wrong value");
        }

        }
    }



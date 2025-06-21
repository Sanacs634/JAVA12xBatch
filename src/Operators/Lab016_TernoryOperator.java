package Operators;

public class Lab016_TernoryOperator {
    public static void main(String[] args) {
        //#### Syntax
        //- result = condition ? expression1 : expression2;
        //- **condition**: This is a boolean expression that is evaluated.
        //- **expression1**: This expression is executed if the condition is true.
        //- **expression2**: This expression is executed if the condition is false.
        int age = 27;
        String canIGoTOGoa =  age > 18 ? "Yes You can" : "You can't";//The return type shouls match with the declaration
        //int canIGoTOGoa =  age > 18 ? "Yes You can" : "You can't";//This is wrong

        System.out.println(canIGoTOGoa);


    }
}

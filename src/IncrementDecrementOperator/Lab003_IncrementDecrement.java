package IncrementDecrementOperator;

public class Lab003_IncrementDecrement {
    public static void main(String[] args) {
        int a =10;

        //System.out.println(a++ + a);
        //System.out.println(a);
        //a++ is post-increment, so it returns 10 (current value), then increments a to 11.
        //
        //a is now 11 (after the increment).
        //
        //So the expression becomes: 10 + 11 = 21
        //
        //Then a is now 11.


        //System.out.println(a++ + ++a);
        //System.out.println(a);

        //Initial value of a = 10
        //
        //Evaluate left to right:
        //
        //a++ returns 10 (post-increment) → a becomes 11 after this
        //
        //++a pre-increments → a becomes 12, and the value is 12
        //
        //So the expression becomes: 10 + 12 = 22
        //
        //Now, a = 12 after this line.




        System.out.println(++a + ++a);
        System.out.println(a);
        //++a is pre-increment, so a becomes 11, and its value is 11
        //
        //The second ++a again increments a to 12, and its value is 12
        //Now a = 12


    }
}

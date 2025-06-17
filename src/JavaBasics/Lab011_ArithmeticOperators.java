package JavaBasics;

public class Lab011_ArithmeticOperators {
    public static void main(String[] args) {
        //1. **Arithmetic Operators -> **Used for basic mathematical operations.
        //    1. `+`   (Addition)
        //    2. `-`   (Subtraction)
        //    3. `*`   (Multiplication)
        //    4. `/`   (Division)
        //    5. `%`   (Modulus)

        int a =11, b = 5 ,c;
        float f = 5.0f;
        System.out.println(a+b);//Add two numbersa
        System.out.println(a-b);//Subtract two numbers
        System.out.println(a*b);//Multiply two numbers
        System.out.println(a/b);//Divides and gives the quotient
        System.out.println(a%b);//Gives the reminder
        System.out.println(b/f);//if you divide a number by float it returns float

        f = -3.0f;//unary operator showing its anegative value
        f = +8.0f;//unary operator showing its a positive value

    }
}

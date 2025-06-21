package IncrementDecrementOperator;
//#### Increment Operator (++)
//- **Prefix Increment**: `++variable` -- value is incremented first and then stored in the result.
//- **Postfix Increment**: `variable++` - print first and then increase the value.
public class Lab002IncrementOperator {
    public static void main(String[] args) {
        int a =12;
        System.out.println(++a);//13
        System.out.println(a++);//13
        System.out.println(a);//14
        int b = 14;
        ++b;
        System.out.println(b);//15
        System.out.println(b++);//15
        System.out.println(b);//16
    }
}

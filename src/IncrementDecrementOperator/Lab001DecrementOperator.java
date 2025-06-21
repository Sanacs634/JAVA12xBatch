package IncrementDecrementOperator;
//#### Decrement Operator (++)
//- **Pre **Decrement: --`variable`
//        - **Post **Decrement: `variable--`

public class Lab001DecrementOperator {
    public static void main(String[] args) {
        int a =12;
        System.out.println(--a);//13
        System.out.println(a--);//13
        System.out.println(a);//14
        int b = 14;
        --b;
        System.out.println(b);//15
        System.out.println(b--);//15
        System.out.println(b);//16
    }
}

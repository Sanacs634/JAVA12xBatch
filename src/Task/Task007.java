package Task;

public class Task007 {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        //c = 11 + 22 + 11(a=12) + 22(b=23) + 13 + 24

        System.out.println("a=" + a);//13

        System.out.println("b=" + b); // 24

        System.out.println("c=" + c);  //103
    }

}

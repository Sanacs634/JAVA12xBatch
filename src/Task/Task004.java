package Task;
//Use the ternary operator, nested ternary operator. If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.
public class Task004 {
    public static void main(String[] args) {
        int a = 19 , b=90 , c=870;
        String greaternumber = (a>b)
                ?(a>c?"greatest number is "+a:"greatest number is "+c)
                :(b>c?"greatest number is "+b:"greatest number is "+c);
        System.out.println(greaternumber);
    }
}

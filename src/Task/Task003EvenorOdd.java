package Task;
//The ternary operator and let me know if I give you a number. Let me know if it is even or odd.
public class Task003EvenorOdd {
    public static void main(String[] args) {
    int num =7;
    String Is_num_evenorodd = num%2==0?(num==0?"Zero is netheir odd nor even":"Its an even number"):"Its an odd number";
    System.out.println(Is_num_evenorodd);
    }
}

package Task;

//Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number,
// and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
public class Task019FizzBuzz {
    public static void main(String[] args) {
        int number =0;
        while(number<=100){
            if(number%3==0 && number%5==0){
                System.out.println("FizzBuzz");
            } else if (number%3==0) {
                System.out.println("Fizz");
            } else if (number%5==0) {
                System.out.println("Buzz");
            }else{
                System.out.println(number);
            }
            number++;
        }
    }
}

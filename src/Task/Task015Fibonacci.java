package Task;
//5

import java.util.Scanner;

public class Task015Fibonacci {
    public static void main(String[] args) {
        int Prevnum =0 , currentnum =1;
        Scanner usserinput = new Scanner(System.in);
        System.out.println("Enter the fibonacci number");
        if(usserinput.hasNextInt()){
            int fibonaccinumber = usserinput.nextInt();
            int i=1;
            System.out.print(Prevnum+" "+currentnum+" ");
            while (i<=(fibonaccinumber-2)){
                int sum = Prevnum + currentnum;
                System.out.print(sum +" ");
                Prevnum = currentnum;
                currentnum = sum;
                i++;

            }
        }else{
            System.out.println("Invalid Entry");
        }
    }
}

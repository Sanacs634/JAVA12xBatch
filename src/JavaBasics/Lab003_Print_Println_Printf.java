package JavaBasics;

public class Lab003_Print_Println_Printf {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Hello");//Gets teransfered to the next line
        System.out.print("WORLD");
        System.out.print("SANA");//Wont get transfered  to next line
        System.out.printf("the number is %d",a);// it treats %d as integer
        System.out.printf("number is %d + %d",a,b);


        /*
        %d = int, byte,long,short
        %s = string
        %b = boolean
        %f = float double
         */
    }
}

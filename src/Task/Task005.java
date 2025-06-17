package Task;

public class Task005 {
    //Again, use the nested ternary.
    // You have to figure it out if I am an adult, minor, or senior.
    // What is the condition? The condition is very simple.
    // If my age is greater than 18, then I can be minor or adult or senior.
    // But if my age is greater than 65, then I am a senior. If I am between 18 to 65, then I am an adult.
    public static void main(String[] args) {
        short age = 78;
        String age_status = (age>18)
                ?(age>65?"Yuo are senior citizen":"You are adult citizen")
                :("You are minor");
        System.out.println(age_status);
    }



}

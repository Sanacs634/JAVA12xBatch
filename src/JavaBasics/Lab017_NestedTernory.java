package JavaBasics;

public class Lab017_NestedTernory {
    public static void main(String[] args) {
        //```
        //result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        //```
        int age = 21;
        String canIGoTOGoa =  age > 18 ? "Yes You can" : "You can't";
        String canIGotoGoa = age>18? (age > 25? "Yes You can go and have a drink":"You can't drink") :"You can't";
        System.out.println(canIGoTOGoa);
    }
}

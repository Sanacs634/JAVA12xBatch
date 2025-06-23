package InterviewQuestions;

public class Q10_String {
    public static void main(String[] args) {
        String s1 ="Hello";
        String s2 ="Hello";
        String s3 ="hello";
        String m1 = new String("Hello");
        String m2 =new String("Hello");
        System.out.println("We have 2 string in SCP and 2String in OA");
       //== checks for the memmory for string
        System.out.println(s1==s2);//In the same memory
        System.out.println(s1==m2);//In diffrent memory
        //Only equals checks for the content in string
        //OnlyIgnorecase dismiss the upper and lowercase
    }
}

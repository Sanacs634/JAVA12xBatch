package String;

public class Lab003_StringImmutability {
    public static void main(String[] args) {
        String s1 = "hellow";
        s1 = s1.concat("asif");
        System.out.println(s1);//Here it willl print the concatination since its get stored in s1 but the older version of s1 stays
    }
}

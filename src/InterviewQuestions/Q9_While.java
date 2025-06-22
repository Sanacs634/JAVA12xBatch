package InterviewQuestions;

public class Q9_While {
    public static void main(String[] args) {
        int a = 10;
//        while(i>=1){
//            System.out.println(i);
//            i--;
//
//        }
        int num = 5, fact =1 , i=1;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}

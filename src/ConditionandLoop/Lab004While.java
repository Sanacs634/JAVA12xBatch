package ConditionandLoop;
//## While Loop
//- When you are using for statement or while statement then** it verifies the condition
//before executing the block.**
//- So in the case of for statement and while statement, when first time condition is false
//then the block will not be executed.
//- for and while statement are also called as **Entry Controlled Loop.**
public class Lab004While {
    public static void main(String[] args) {
        int a= 5, b=10;
        while(a>b) {
            System.out.println("Atleast executed oncew");
        }
//        do{
//            System.out.println("Atleast executed oncew");
//
//        } while(a>b);
    }
}

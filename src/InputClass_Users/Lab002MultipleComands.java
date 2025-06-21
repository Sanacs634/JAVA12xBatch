package InputClass_Users;

public class Lab002MultipleComands {
    public static void main(String[] args) {
        String input1 = args[0];
        String input2 = args[1];
        String input3 = args[2];
        String input4 = args[3];// if the variable is less we get error howerver we dont have any issue in putting more

        Integer.parseInt(input1);
        Integer.parseInt(input2);//if we use float incase of intger it will throw error
        Integer.parseInt(input3);
        Float.parseFloat(input4);
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4);
    }
}

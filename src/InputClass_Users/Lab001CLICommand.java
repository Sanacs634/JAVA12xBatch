package InputClass_Users;

public class Lab001CLICommand {
    //CommandLine
    public static void main(String[] args) {
        String user_input = args[0];//Passing from Command
        System.out.println(user_input instanceof String);//it returns in a string
        int age = Integer.parseInt(user_input);
        System.out.println(user_input);

    }

}

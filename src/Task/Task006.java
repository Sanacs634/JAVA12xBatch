package Task;

public class Task006
{
    public static void main(String[] args) {
        int i = 11;

        i = i++ + ++i;

        // i = 11 then after increment i value becomes 12
        //then it added with an increment where i becomes 13 so
        //11+13=24

        System.out.println(i);
        //24
    }
}

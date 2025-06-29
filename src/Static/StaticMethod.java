package Static;

public class StaticMethod {
    static class MathUtil {
        static int square(int x) {
            return x * x;
        }
    }

    public class Main {
        public static void main(String[] args) {
            System.out.println(MathUtil.square(5)); // 25
        }
    }

}

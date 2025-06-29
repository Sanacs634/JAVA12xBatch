package Static;

public class StaticVariable {
    static class Counter {
        static int count = 0; // shared among all objects

        Counter() {
            count++;
            System.out.println(count);
        }
    }

    public class Main {
        public static void main(String[] args) {
            new Counter(); // 1
            new Counter(); // 2
            new Counter(); // 3
        }
    }

}

package Static;

public class StaticBlock {
    static {
        System.out.println("Static block runs once when class is loaded");
    }


    public class Main {
        public static void main(String[] args) {
            new StaticBlock(); // Static block runs here
        }
    }

}

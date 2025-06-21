package Task;

public class Task008 {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        // m = 1(0) - 2(1) - 3(2) = 1-2-3 = -4

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);

        //i = 0
        //j = 1
        //k = 2
    }
}

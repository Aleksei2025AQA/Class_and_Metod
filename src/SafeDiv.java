public class SafeDiv {
    public static int safeDiv(int x, int y) {

        if (y == 0) {
            return 0;
        } else {
            return x / y;
        }
    }

    public static void main(String[] args) {
        System.out.println("x=10 y=0: " + safeDiv(10, 0));
        System.out.println("x=12 y=4: " + safeDiv(12, 4));
    }
}

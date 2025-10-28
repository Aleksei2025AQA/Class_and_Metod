public class IsPositive {

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static void main(String[] args) {
        System.out.println("x = 7: " + isPositive(7));
        System.out.println("x = -9: " + isPositive(-9));
        System.out.println("x = 0: " + isPositive(0));
    }
}

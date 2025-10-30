public class MaxValue {

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {

        System.out.println("x=1 y=9: " + max(1, 9));
        System.out.println("x=2 y=-10: " + max(2, -10));
        System.out.println("x=3 y=3: " + max(3, 3));
        System.out.println("x=-2 y=-5: " + max(-2, -5));
    }
}
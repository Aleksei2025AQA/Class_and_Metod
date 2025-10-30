public class MagicSix {

    public static boolean magic6(int x, int y) {

        return (x == 6 || y == 6) ||
                (x + y == 6) ||
                (x - y == 6 || y - x == 6);
    }

    public static void main(String[] args) {

        System.out.println("x=3 y=3: " + magic6(3, 3) + " (3+3=6)");
        System.out.println("x=10 y=4: " + magic6(10, 4) + " (|10-4|=6)");
        System.out.println("x=1 y=1: " + magic6(1, 1) + " (нет условий)");
        System.out.println("x=-6 y=0: " + magic6(-6, 0) + " (x=-6≠6)");
        System.out.println("x=12 y=6: " + magic6(12, 6) + " (y=6)");

    }
}

public class SumThree {

    public static boolean sum3(int x, int y, int z) {

        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public static void main(String[] args) {

        System.out.println("x=5 y=5 z=10: " + sum3(5, 5, 10) + " (5+5=10)");
        System.out.println("x=1 y=3 z=5: " + sum3(1, 3, 5) + " (нет комбинации)");
        System.out.println("x=0 y=0 z=0: " + sum3(0, 0, 0) + " (0+0=0)");
        System.out.println("x=-2 y=5 z=1: " + sum3(-2, 5, 1) + " (нет комбинации)");
        System.out.println("x=-5 y=-3 z=-8: " + sum3(-5, -3, -8) + " (-5+(-3)=-8)");
    }
}

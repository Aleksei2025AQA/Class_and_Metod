public class MaxThree {

    public static int max3(int x, int y, int z) {

        int max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("x=5 y=7 z=7: " + max3(0, 9, 7));
        System.out.println("x=8 y=-1 z=4: " + max3(8, -1, 4));
        System.out.println("x=1 y=3 z=2: " + max3(-1, -3, -2));
    }
}

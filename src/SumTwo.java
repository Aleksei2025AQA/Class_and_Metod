public class SumTwo {

    public static int sum2(int x, int y) {
        int sum = x + y;

        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {

        System.out.println("x=9 y=-2: " + sum2(9, -2) + " (9+(-2)=7 → 7)");
        System.out.println("x=13 y=4: " + sum2(13, 4) + " (13+4)=17 → 20)");
    }
}

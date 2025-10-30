public class ComparisonString {

    public static String makeDecision(int x, int y) {

        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    public static void main(String[] args) {

        System.out.println("x=9 y=20: " + makeDecision(9, 20));
        System.out.println("x=1 y=-1: " + makeDecision(1, -1));    // "8 > -1"
        System.out.println("x=2 y=2: " + makeDecision(2, 2));      // "4 == 4"
    }
}

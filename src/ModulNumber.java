public class ModulNumber {
    public static int abs(int x) {

        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {

        System.out.println("x=1: " + abs(1));
        System.out.println("x=-3: " + abs(-3));
        System.out.println("x=0: " + abs(0));
    }
}

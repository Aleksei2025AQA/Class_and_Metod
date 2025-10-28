public class IsEqual {

    public static boolean isEqual(int a, int b, int c) {

        return a == b && b == c;
    }

    public static void main(String[] args) {

        System.out.println("Пример 1:");
        System.out.println("a=0 b=0 c=0");
        System.out.println("Результат: " + isEqual(0, 0, 0));

        System.out.println("\nПример 2:");
        System.out.println("a=9 b=15 c=9");
        System.out.println("Результат: " + isEqual(9, 15, 9));
    }
}

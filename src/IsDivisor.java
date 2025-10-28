public class IsDivisor {

    public static boolean isDivisor(int a, int b) {

        return (b != 0 && a % b == 0) || (a != 0 && b % a == 0);
    }

    public static void main(String[] args) {

        System.out.println("Пример 1:");
        System.out.println("a=3 b=9");
        System.out.println("Результат: " + isDivisor(3, 9));

        System.out.println("\nПример 2:");
        System.out.println("a=3 b=16");
        System.out.println("Результат: " + isDivisor(3, 16));
    }
}

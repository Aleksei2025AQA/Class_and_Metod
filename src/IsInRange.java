public class IsInRange {

    public static boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        return num >= min && num <= max;
    }

    public static void main(String[] args) {
        System.out.println("Пример 1:");
        System.out.println("a=-5 b=1 num=0");
        System.out.println("Результат: " + isInRange(-5, 1, 0));

        System.out.println("\nПример 2:");
        System.out.println("a=99 b=1 num=100");
        System.out.println("Результат: " + isInRange(99, 1, 0));
    }
}

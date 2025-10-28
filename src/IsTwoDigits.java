public class IsTwoDigits {

    public static boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    public static void main(String[] args) {
        // Тестирование метода с примерами из задания
        int test1 = 99;
        int test2 = 100;
        int test3 = 9;

        System.out.println("Пример 1:");
        System.out.println("x = " + test1);
        System.out.println("Результат: " + is2Digits(test1));

        System.out.println("\nПример 2:");
        System.out.println("x = " + test2);
        System.out.println("Результат: " + is2Digits(test2));

        System.out.println("\nПример 3:");
        System.out.println("x = " + test3);
        System.out.println("Результат: " + is2Digits(test3));
    }
}
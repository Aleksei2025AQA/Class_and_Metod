public class IsUpperCase {

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static void main(String[] args) {
        char test1 = 'Z';
        char test2 = 'a';

        System.out.println("Пример 1:");
        System.out.println("x = '" + test1 + "'");
        System.out.println("Результат: " + isUpperCase(test1));

        System.out.println("\nПример 2:");
        System.out.println("x = '" + test2 + "'");
        System.out.println("Результат: " + isUpperCase(test2));
    }
}

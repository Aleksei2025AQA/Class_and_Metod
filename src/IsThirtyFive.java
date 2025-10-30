public class IsThirtyFive {

    public static boolean is35(int x) {
        // Проверяем делимость на 3 и на 5
        boolean divisibleBy3 = (x % 3 == 0);
        boolean divisibleBy5 = (x % 5 == 0);

        // Возвращаем true если делится на 3 ИЛИ на 5, но НЕ на оба одновременно
        return (divisibleBy3 || divisibleBy5) && !(divisibleBy3 && divisibleBy5);
    }

    public static void main(String[] args) {

        System.out.println("x=3: " + is35(3) + " (делится на 3)");
        System.out.println("x=10: " + is35(10) + " (делится на 5)");
        System.out.println("x=45: " + is35(45) + " (делится на 3 и 5)");
        System.out.println("x=1: " + is35(1) + " (не делится)");
        System.out.println("x=0: " + is35(0) + " (делится на 3 и 5)");
    }
}

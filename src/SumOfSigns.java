public class SumOfSigns {
    public static int sumLastNums(int x) {
        return (x % 10) + ((x / 10) % 10);
    }

    public static void main(String[] args) {
        int x = 168415;
        System.out.println("Число: " + x);
        System.out.println("Сумма двух последних знаков числа равна: " + sumLastNums(x));
    }
}

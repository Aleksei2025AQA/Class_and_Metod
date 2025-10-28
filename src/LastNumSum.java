public class LastNumSum {

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    public static void main(String[] args) {

        int result = lastNumSum(
                lastNumSum(
                        lastNumSum(
                                lastNumSum(5, 11),
                                123
                        ),
                        14
                ),
                1
        );

        System.out.println("Результат: " + result);
    }
}

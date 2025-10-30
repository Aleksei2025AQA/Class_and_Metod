public class AgeFormatter {

    public static String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;


        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return x + " лет";
        }


        if (lastDigit == 1) {
            return x + " год";
        } else if (lastDigit == 2 || lastDigit == 3 || lastDigit == 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public static void main(String[] args) {

        System.out.println("x=112: " + age(112));
        System.out.println("x=13: " + age(13));
        System.out.println("x=14: " + age(14));
        System.out.println("x=11: " + age(11));
        System.out.println("x=22: " + age(22));
        System.out.println("x=101: " + age(101));
    }
}

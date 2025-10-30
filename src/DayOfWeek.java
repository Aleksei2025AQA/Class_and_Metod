public class DayOfWeek {

    public static String day(int x) {

        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    public static void main(String[] args) {

        System.out.println("x=1: " + day(1));
        System.out.println("x=2: " + day(2));
        System.out.println("x=3: " + day(3));
        System.out.println("x=4: " + day(4));
        System.out.println("x=5: " + day(5));
        System.out.println("x=6: " + day(6));
        System.out.println("x=7: " + day(7));

        System.out.println("x=0: " + day(0));
        System.out.println("x=8: " + day(8));
        System.out.println("x=-1: " + day(-1));
        System.out.println("x=100: " + day(100));
    }
}

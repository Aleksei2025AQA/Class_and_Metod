public class PrintDays {

    public static void printDays(String x) {

        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    public static void main(String[] args) {

        System.out.println("x=\"понедельник\":");
        printDays("понедельник");

        System.out.println("\nx=\"пятница\":");
        printDays("пятница");

        System.out.println("\nx=\"воскресенье\":");
        printDays("воскресенье");

        System.out.println("\nx=\"неделя\":");
        printDays("неделя");
    }
}

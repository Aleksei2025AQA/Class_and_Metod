public class CharToNum {
    public static int charToNum(char x) {
        return x - '0';
    }

    public static void main(String[] args) {
        // Тестирование
        System.out.println("Символ '3' -> число " + charToNum('3'));
        System.out.println("Символ '0' -> число " + charToNum('0'));
        System.out.println("Символ '9' -> число " + charToNum('9'));
    }
}

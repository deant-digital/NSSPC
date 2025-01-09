import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        long value = Long.parseLong(String.valueOf(string.charAt(1)) + string.charAt(3) + string.charAt(2) + string.charAt(0));
        for (int i = 0; i < 2; ++i) {
            value *= value;
            value %= 1_000_000;
        }
        System.out.println(value);
    }
}

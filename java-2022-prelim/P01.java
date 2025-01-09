import java.util.Scanner;

public class P01 {

    public static int getInt(Scanner scanner) {
        String string = scanner.next();
        try {
            double value = Double.parseDouble(string);
            int intValue = Integer.parseInt(string);
            if (Math.abs(value - intValue) < 1e-9) return intValue;
        } catch (Exception ignored) {
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = getInt(scanner);
        int y = getInt(scanner);
        if (x > y) {
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
        }
        if (x < 0 || y == Integer.MAX_VALUE) {
            System.out.println("Invalid Input");
            return;
        }
        x = (x + 1) / 2 * 2;
        y = y / 2 * 2;
        System.out.println(((y - x) / 2 + 1) * (x + y) / 2);
    }
}

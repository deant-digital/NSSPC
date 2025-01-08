import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        double value = Double.parseDouble(string.substring(0, string.length() - 1));
        char c = string.charAt(string.length() - 1);
        if (c == 'C') System.out.printf("%.1fF\n", value * 9 / 5 + 32);
        else System.out.printf("%.1fC\n", (value - 32) * 5 / 9);
    }
}

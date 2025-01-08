import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            double temperature = scanner.nextDouble();
            System.out.printf("%.7f%n", (temperature + 273.15) / (99 + 273.15) * 2800);
        }
    }
}

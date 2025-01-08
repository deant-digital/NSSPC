import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.printf("%.2f", 2 * 3.14 * r * (h + r));
    }
}

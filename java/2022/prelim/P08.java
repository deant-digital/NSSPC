import java.util.Scanner;

public class P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dx = scanner.nextDouble();
        double dy = scanner.nextDouble();
        double w = scanner.nextDouble();
        double v = scanner.nextDouble();
        if (v * Math.min(dx, dy) > w || v * Math.max(dx, dy) < w) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.printf("%.2f %.2f", (w - dy * v) / (dx - dy) * 100 / v, (w - dx * v) / (dy - dx) * 100 / v);
    }
}

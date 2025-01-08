import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = (m + 2) * (m + 2) + 4 * (c + 3);
        if (delta < 0) {
            System.out.println("No intersection");
            return;
        }
        double center = m / 2 + 1;
        if (delta == 0) {
            System.out.println("One intersection");
            System.out.printf("%.7f, %.7f", center, m * center + c);
            return;
        }
        double difference = Math.sqrt(delta) / 2;
        double x1 = center + difference;
        double x2 = center - difference;
        System.out.println("Two intersections");
        System.out.printf("%.7f, %.7f%n", x1, m * x1 + c);
        System.out.printf("%.7f, %.7f", x2, m * x2 + c);
    }
}

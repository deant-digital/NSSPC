import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        System.out.printf("%.2f", t / (1 / 30.0 + 1 / 22.0));
    }
}

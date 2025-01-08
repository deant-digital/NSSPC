import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = scanner.nextDouble();
        System.out.printf("%.2f", Math.sqrt(h * 2 / 9.8));
    }
}

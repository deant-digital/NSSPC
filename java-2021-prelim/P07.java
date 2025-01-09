import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        double r = scanner.nextDouble();
        double t = scanner.nextDouble();
        System.out.println((int) Math.ceil((Math.log(t) - Math.log(p)) / Math.log(1 + r)));
    }
}

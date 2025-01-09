import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println((Math.abs(x - y) + 1) * (x + y) / 2);
    }
}

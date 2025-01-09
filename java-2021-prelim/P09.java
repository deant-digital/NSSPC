import java.util.Scanner;

public class P09 {

    public static int gcd(int x, int y) {
        while (x != 0) {
            int t = x;
            x = y % x;
            y = t;
        }
        return y;
    }

    public static int lcm(int x, int y) {
        return x / gcd(x, y) * y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(lcm(x, lcm(y, z)));
    }
}

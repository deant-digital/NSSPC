import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String c = scanner.next();
        for (int i = 0; i < n; ++i)
            System.out.println(" ".repeat(n - i - 1) + c.repeat(2 * i + 1));
        for (int i = 0; i < n; ++i)
            System.out.println(" ".repeat(n - 1) + c);
    }
}

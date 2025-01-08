import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i * i <= n; ++i) {
            if (n % i != 0) continue;
            sum += i + n / i;
            if (i * i == n) sum -= i;
        }
        System.out.println(sum);
    }
}

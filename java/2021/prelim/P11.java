import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; ++i)
            isPrime[i] = true;
        int largestPrime = 2;
        for (int i = 2; i <= n; ++i) {
            if (!isPrime[i]) continue;
            largestPrime = i;
            for (int j = i * i; j <= n; j += i)
                isPrime[j] = false;
        }
        System.out.println(largestPrime);
    }
}

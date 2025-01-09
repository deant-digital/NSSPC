import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] dp = new int[r][c];
        int largestSquare = 1;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                int value = scanner.nextInt();
                if (value == 0) dp[i][j] = 0;
                else if (i == 0 || j == 0) dp[i][j] = 1;
                else dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                if (dp[i][j] > largestSquare) largestSquare = dp[i][j];
            }
        }
        if (largestSquare > 1) System.out.println(largestSquare);
        else System.out.println("No Square");
    }
}

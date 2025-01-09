import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; ++i) {
            int value = scanner.nextInt();
            if (value % 2 == 0) ++count;
        }
        System.out.println(count);
    }
}

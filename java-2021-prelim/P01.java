import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i)
            a = a * 5 + 7;
        System.out.println(a);
    }
}

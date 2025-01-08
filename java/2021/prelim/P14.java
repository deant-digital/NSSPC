import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (y % 2 != 0 || x * 4 < y || x * 2 > y) {
            System.out.println("No feasible solution");
            return;
        }
        System.out.println((x * 2 - y / 2) + " " + (y / 2 - x));
    }
}

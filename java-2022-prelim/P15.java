import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int p = scanner.nextInt();
        int n = (1 << x) - 1;
        int[] array = new int[n];
        int idx = -1;
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
            if (array[i] == p) idx = i;
        }
        int i = idx * 2 + 1;
        int j = idx * 2 + 2;
        if (i >= n || array[i] == -1) System.out.print("NULL");
        else System.out.print(array[i]);
        System.out.print(" ");
        if (j >= n || array[j] == -1) System.out.print("NULL");
        else System.out.print(array[j]);
    }
}

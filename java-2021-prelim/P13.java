import java.util.Arrays;
import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < 7; ++i)
            array[i] = scanner.nextInt();
        Arrays.sort(array);
        System.out.printf("%.2f", (array[2] + array[3] + array[4]) / 3.0);
    }
}

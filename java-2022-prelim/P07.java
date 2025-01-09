import java.util.Arrays;
import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[3];
        array[0] = scanner.nextDouble();
        array[1] = scanner.nextDouble();
        array[2] = scanner.nextDouble();
        Arrays.sort(array);
        if (array[0] + array[1] <= array[2]) {
            System.out.println("Invalid");
            return;
        }
        if (array[0] == array[2]) System.out.println("Equilateral Triangle");
        else if (array[0] == array[1] || array[1] == array[2]) System.out.println("Isosceles Triangle");
        else System.out.println("Scalene Triangle");
        double s = (array[0] + array[1] + array[2]) / 2;
        System.out.println((int) Math.round(Math.sqrt(s * (s - array[0]) * (s - array[1]) * (s - array[2]))));
    }
}

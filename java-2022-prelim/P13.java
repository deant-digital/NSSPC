import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, nums = 0;
        while (nums < 20) {
            int value = scanner.nextInt();
            if (value < -100 || value > 100) continue;
            count += map.getOrDefault(x - value, 0);
            map.put(value, map.getOrDefault(value, 0) + 1);
            ++nums;
        }
        System.out.println(count);
    }
}

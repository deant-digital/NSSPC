import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.length() > 100) {
            System.out.println("Invalid Length");
            return;
        }
        int sum = 0;
        for (char c : string.toCharArray()) {
            int v = Character.toLowerCase(c) - 'a' + 1;
            if (v == 2 || v == 3 || v == 5 || v == 7 || v == 11 || v == 13 || v == 17 || v == 19 || v == 23) sum += v;
        }
        System.out.println(sum);
    }
}

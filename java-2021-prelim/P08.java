import java.util.Scanner;

public class P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int count = 0;
        for (char c : string.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ++count;
        }
        System.out.println(count);
    }
}

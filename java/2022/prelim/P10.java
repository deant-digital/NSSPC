import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        boolean bl;
        do {
            bl = false;
            for (int i = 1; i < string.length(); ++i) {
                if (string.charAt(i) == string.charAt(i - 1)) {
                    int j = i + 1;
                    while (j < string.length() && string.charAt(j) == string.charAt(i)) ++j;
                    string = string.substring(0, i - 1) + string.substring(j);
                    bl = true;
                    break;
                }
            }
        } while (bl);
        if (string.isEmpty()) System.out.println("Empty String");
        else System.out.println(string);
    }
}

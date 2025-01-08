import java.util.*;

public class P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.length() > 25) {
            System.out.println("Invalid Length");
            return;
        }
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if ((!Character.isLetter(c) || Character.isUpperCase(c)) && !builder.isEmpty()) {
                if (!set.contains(builder.toString())) {
                    set.add(builder.toString());
                    list.add(builder.toString());
                }
                builder.setLength(0);
            }
            if (Character.isLetter(c)) builder.append(c);
        }
        if (!builder.isEmpty() && !set.contains(builder.toString())) list.add(builder.toString());
        System.out.println(String.join(" ", list));
        System.out.println(list.size());
    }
}

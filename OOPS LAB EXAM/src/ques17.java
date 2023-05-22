import java.util.Arrays;
import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];

        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        Arrays.sort(strings);

        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        System.out.println("\nCombined and reversed strings:");
        for (int i = 0; i < strings.length - 1; i += 2) {
            String combined = strings[i] + strings[i + 1];
            String reversed = reverseString(strings[i]);
            System.out.println(combined + " (Reversed First: " + reversed + ")");
        }

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}


package methods;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String result = repeatString(str, n);

        System.out.println(result);
        scanner.close();
    }

    private static String repeatString(String str, int n) {
        StringBuilder repeatedString = new StringBuilder();

        for (int i = 0; i < n; i++) {
            repeatedString.append(str);
        }

        return repeatedString.toString();
    }
}

package methods;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of values (int, char, String): ");
        String type = scanner.next();

        int int1, int2;
        char char1, char2;
        String str1, str2;

        switch (type) {
            case "int":
                System.out.print("Enter the first integer: ");
                int1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                int2 = scanner.nextInt();
                System.out.println(getMaxValue(int1, int2));
                break;
            case "char":
                System.out.print("Enter the first character: ");
                char1 = scanner.next().charAt(0);
                System.out.print("Enter the second character: ");
                char2 = scanner.next().charAt(0);
                System.out.println(getMaxValue(char1, char2));
                break;
            case "String":
                System.out.print("Enter the first string: ");
                str1 = scanner.next();
                System.out.print("Enter the second string: ");
                str2 = scanner.next();
                System.out.println(getMaxValue(str1, str2));
                break;
            default:
                System.out.println("Invalid type entered.");
                break;
        }
        scanner.close();
    }

    private static int getMaxValue(int value1, int value2) {
        return Math.max(value1, value2);
    }

    public static char getMaxValue(char value1, char value2) {
        return (value1 > value2) ? value1 : value2;
    }

    public static String getMaxValue(String value1, String value2) {
        return (value1.compareTo(value2) > 0) ? value1 : value2;
    }
}

package methods;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = calculateArea(width, length);
        System.out.println(area);

        scanner.close();
    }

    private static double calculateArea(double width, double length) {
        return width * length;
    }
}

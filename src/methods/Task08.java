package methods;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = Double.parseDouble(scanner.nextLine());
        int exponent = Integer.parseInt(scanner.nextLine());

        double result = powerUp(base, exponent);

        System.out.println(result);
        scanner.close();
    }

    private static double powerUp(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

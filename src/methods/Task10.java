package methods;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int result = multiplySumOfEvenAndOddDigits(number);

        System.out.println(result);
        scanner.close();
    }

    private static int multiplySumOfEvenAndOddDigits(int number) {
        int sumEven = 0;
        int sumOdd = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            number /= 10;
        }

        return sumEven * sumOdd;
    }
}

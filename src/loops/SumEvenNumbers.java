package loops;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        sumEvenNumbers();
    }

    private static void sumEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += 2 * i;
        }
        System.out.println(sum);
    }
}

package arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        sumEven();
    }

    private static void sumEven() {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int evenNumber = 0;

        for (int i = 0; i <= input; i++) {
            sum += evenNumber;
            evenNumber += 2;
        }
        System.out.println(sum);
    }
}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        sumEven();
    }

    private static void sumEven() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] stringArray = input.split(" ");

        int sum = Arrays.stream(stringArray)
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println(sum);
    }
}

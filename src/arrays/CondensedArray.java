package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondensedArray {
    public static void main(String[] args) {
        condensed();
    }

    private static void condensed() {
        Scanner sc = new Scanner(System.in);
        String inputOne = sc.nextLine().trim();
        String[] arr = inputOne.split(",");
        int[] numbers = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }
        System.out.println(numbers[0]);
    }
}

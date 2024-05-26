package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubs {
    public static void main(String[] args) {
        sumArraySubs();
    }

    private static void sumArraySubs() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(",");

        int subtraction = Arrays.stream(array)
                        .mapToInt(Integer::parseInt)
                        .reduce(0, (sum, num) -> sum + (num % 2 == 0 ? num : -num));

        System.out.println(subtraction);
    }
}

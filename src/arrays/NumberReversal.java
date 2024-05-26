package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        numberReversal();
    }

    private static void numberReversal() {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        String original = Integer.toString(input);
        String reversedString = new StringBuilder(original).reverse().toString();
        int reversed = Integer.parseInt(reversedString);
        System.out.println(reversed);
    }
}

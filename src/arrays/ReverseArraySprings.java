package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArraySprings {
    public static void main(String[] args) {
        reversingArrayOfSprings();
    }

    private static void reversingArrayOfSprings() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(",");

        Collections.reverse(Arrays.asList(arr));
        String reversed = String.join(" ", arr);

        System.out.println(reversed);
    }
}

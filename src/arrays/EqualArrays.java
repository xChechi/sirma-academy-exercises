package arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        equalArrays();
    }

    private static void equalArrays() {
        Scanner sc = new Scanner(System.in);
        String inputOne = sc.nextLine();
        String[] arrayOne = inputOne.split(",");
        String inputTwo = sc.nextLine();
        String[] arrayTwo = inputTwo.split(",");
        int sum;
        int index = -1;

        for (int i = 0; i < arrayOne.length && i < arrayTwo.length; i++) {
            if (!arrayOne[i].equals(arrayTwo[i])) {
               index = i;
               break;
            }
        }

        if (index == -1 && arrayOne.length == arrayTwo.length) {
            sum = Arrays.stream(arrayOne)
                    .mapToInt(Integer::parseInt)
                    .sum();
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.println("Arrays are not identical. Found difference at " + index + " index");
        }
    }
}

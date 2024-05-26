package arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args) {
        reverseArray();
    }

    private static void reverseArray() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        String[] newArr = new String[number];
        for (int i = 0; i < number; i++) {
            newArr[i] = arr[i];
        }

        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = number - 1; i >= 0; i--) {
            reversedBuilder.append(newArr[i]);
            if (i > 0) {
                reversedBuilder.append(" ");
            }
        }

        System.out.println(reversedBuilder);
    }
}

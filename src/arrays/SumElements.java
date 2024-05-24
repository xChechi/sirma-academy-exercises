package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        sumElements();
    }

    private static void sumElements() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");

        int firstElement = Integer.parseInt(array[0]);
        int lastElement = Integer.parseInt(array[array.length - 1]);
        int sum = firstElement + lastElement;

        System.out.println(sum);
    }
}

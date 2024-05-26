package arrays;

import java.util.Scanner;

public class PrintCustomElement {
    public static void main(String[] args) {
        printingCustomElement();
    }

    private static void printingCustomElement() {
        Scanner sc = new Scanner(System.in);

        String inputOne = sc.nextLine().trim();
        String[] arr = inputOne.split(",");

        int leap = Integer.parseInt(sc.nextLine());

        int size = (arr.length + leap - 1) / leap;
        String[] collected = new String[size];
        int index = 0;

        for (int i = 0; i < arr.length; i+=leap) {
            collected[index++] = arr[i];
        }
        System.out.println(String.join(" ", collected));
    }
}

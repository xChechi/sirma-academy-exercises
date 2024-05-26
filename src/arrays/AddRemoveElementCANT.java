package arrays;

import java.util.Scanner;

public class AddRemoveElementCANT {
    public static void main(String[] args) {
        addRemoveElement();
    }

    private static void addRemoveElement() {
        Scanner sc = new Scanner(System.in);

        // Read the input commands separated by spaces
        System.out.println("Enter commands separated by spaces (add/remove):");
        String input = sc.nextLine();
        String[] commands = input.split(" ");

        // Initialize an array to store the numbers
        int[] numbers = new int[0];
        int currentNumber = 1;

        // Process each command
        for (String command : commands) {
            if (command.equals("add")) {
                // Add currentNumber to the array
                int[] newArray = new int[numbers.length + 1];
                System.arraycopy(numbers, 0, newArray, 0, numbers.length);
                newArray[numbers.length] = currentNumber;
                numbers = newArray;
            } else if (command.equals("remove")) {
                // Remove the last element from the array if it's not empty
                if (numbers.length > 0) {
                    int[] newArray = new int[numbers.length - 1];
                    System.arraycopy(numbers, 0, newArray, 0, numbers.length - 1);
                    numbers = newArray;
                }
            }
            currentNumber++;
        }

        // Print the elements in a row, separated by a single space
        if (numbers.length == 0) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(numbers[i]);
            }
            System.out.println();
        }

        sc.close();
    }
}

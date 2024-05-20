package statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number 1");
        int numberOne = sc.nextInt();

        System.out.println("Number 2");
        int numberTwo = sc.nextInt();

        System.out.println("Operation");
        String operation = sc.next();

        double result = 0;
        boolean valid = true;

        switch (operation) {
            case "add":
                result = numberOne + numberTwo;
                break;
            case "subtract":
                result = numberOne - numberTwo;
                break;
            case "divide":
                if (numberTwo != 0) {
                    result = (double) numberOne / numberTwo;
                } else {
                    valid = false;
                    System.out.println("Can not divide by zero");
                }
                break;
            case "multiply":
                result = numberOne * numberTwo;
                break;
            default:
                valid = false;
                System.out.println("Invalid operation");
        }

        if (valid) {
            System.out.printf("%.2f", result);
        }

        sc.close();
    }
}

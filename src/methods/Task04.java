package methods;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter command (add, multiply, subtract, divide):");
        String command = sc.nextLine().trim().toLowerCase();

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        switch (command) {
            case "add":
                add(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
            default:
                System.out.println("Invalid command");
                break;
        }

        sc.close();
    }

    public static void add(double a, double b) {
        double result = a + b;
        System.out.println("Result: " + result);
    }

    public static void multiply(double a, double b) {
        double result = a * b;
        System.out.println("Result: " + result);
    }

    public static void subtract(double a, double b) {
        double result = a - b;
        System.out.println("Result: " + result);
    }

    public static void divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}


package methods;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product (coffee, water, coke, snacks):");
        String product = sc.nextLine().trim().toLowerCase();

        System.out.println("Enter the quantity:");
        int quantity = sc.nextInt();

        calculateTotalPrice(product, quantity);

        sc.close();
    }

    public static void calculateTotalPrice(String product, int quantity) {
        double pricePerUnit = 0.0;

        switch (product) {
            case "coffee":
                pricePerUnit = 1.50;
                break;
            case "water":
                pricePerUnit = 1.00;
                break;
            case "coke":
                pricePerUnit = 1.40;
                break;
            case "snacks":
                pricePerUnit = 2.00;
                break;
            default:
                System.out.println("Invalid product");
                return;
        }

        double totalPrice = pricePerUnit * quantity;
        System.out.printf("Total price: %.2f%n", totalPrice);
    }
}

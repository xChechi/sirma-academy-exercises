package statements;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        market();
    }

    private static void market() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vegetable?");
        String product = sc.nextLine();
        System.out.println("Day?");
        String day = sc.nextLine();
        System.out.println("Qty?");

        int quantity = sc.nextInt();
        double price = 0;
        boolean isValid = true;

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                if (product.equals("tomato")) {
                    price = 2.50 * quantity;
                } else if (product.equals("onion")) {
                    price = 1.20 * quantity;
                } else if (product.equals("lettuce")) {
                    price = 0.85 * quantity;
                } else if (product.equals("cucumber")) {
                    price = 1.45 * quantity;
                } else if (product.equals("pepper")) {
                    price = 5.50 * quantity;
                } else {
                    isValid = false;
                    System.out.println("error");
                }
                break;
            case "Saturday", "Sunday":
                if (product.equals("tomato")) {
                    price = 2.80 * quantity;
                } else if (product.equals("onion")) {
                    price = 1.30 * quantity;
                } else if (product.equals("lettuce")) {
                    price = 0.85 * quantity;
                } else if (product.equals("cucumber")) {
                    price = 1.75 * quantity;
                } else if (product.equals("pepper")) {
                    price = 3.50 * quantity;
                } else System.out.println("error");
                break;
            default:
                isValid = false;
                System.out.println("error");
        }

        if (isValid) {
            System.out.printf("%.2f", price);
        }

    }
}

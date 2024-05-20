package statements;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        grocery();
    }

    private static void grocery() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product?");
        String product = sc.nextLine();
        System.out.println("City?");
        String city = sc.nextLine();
        System.out.println("Qty?");
        int quantity = sc.nextInt();

        double totalPrice = 0;

        switch (product) {
            case "tea":
                if (city.equals("Sofia")) {
                    totalPrice = quantity * 0.50;
                }
                if (city.equals("Plovdiv")) {
                    totalPrice = quantity * 0.40;
                }
                if (city.equals("Varna")) {
                    totalPrice = quantity * 0.45;
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    totalPrice = quantity * 0.80;
                }
                if (city.equals("Plovdiv")) {
                    totalPrice = quantity * 0.70;
                }
                if (city.equals("Varna")) {
                    totalPrice = quantity * 0.70;
                }
                break;
            case "juice":
                if (city.equals("Sofia")) {
                    totalPrice = quantity * 1.20;
                }
                if (city.equals("Plovdiv")) {
                    totalPrice = quantity * 1.15;
                }
                if (city.equals("Varna")) {
                    totalPrice = quantity * 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    totalPrice = quantity * 1.45;
                }
                if (city.equals("Plovdiv")) {
                    totalPrice = quantity * 1.30;
                }
                if (city.equals("Varna")) {
                    totalPrice = quantity * 1.35;
                }
                break;
            case "chips":
                if (city.equals("Sofia")) {
                    totalPrice = quantity * 1.60;
                }
                if (city.equals("Plovdiv")) {
                    totalPrice = quantity * 1.50;
                }
                if (city.equals("Varna")) {
                    totalPrice = quantity * 1.55;
                }
                break;
            default:
                System.out.println("Invalid product");
        }

        System.out.printf("%.2f", totalPrice);
        sc.close();
    }
}

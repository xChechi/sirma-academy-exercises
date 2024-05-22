package statements;

import java.util.Scanner;

public class EraIdentifier {
    public static void main(String[] args) {
        eraIdentifier();
    }

    private static void eraIdentifier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid year:");
            sc.next();
        }

        int year = sc.nextInt();

        System.out.println("Enter material (wood/stone/steel)");
        String material = sc.next().toLowerCase().trim();

        if (isValidatedInput(material)) {
            switch (material) {
                case "wood":
                        if (year >= 1500 && year <= 1800) {
                            System.out.println("Colonial");
                        } else System.out.println("Uncertain");
                    break;
                case "stone":
                        if (year <= 500) {
                            System.out.println("Ancient");
                        } else if (year <= 1500) {
                            System.out.println("Medieval");
                        } else System.out.println("Uncertain");
                    break;
                case "steel":
                        if (year >= 1900) {
                            System.out.println("Modern");
                        } else if (year >= 1800) {
                            System.out.println("Industrial");
                        } else System.out.println("Uncertain");
                    break;
                default:
                    System.out.println("error");
            }
        } else System.out.println("Out of scope");
        sc.close();
    }

    private static boolean isValidatedInput(String material) {
        return material.equals("wood") || material.equals("stone") || material.equals("steel");
    }

}

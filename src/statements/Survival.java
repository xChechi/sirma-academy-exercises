package statements;

import java.util.Scanner;

public class Survival {
    public static void main(String[] args) {
        surviving();
    }

    private static void surviving() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Time of day? (day/night)");
        String time = sc.next();
        System.out.println("Environment? (forest/desert)");
        String environment = sc.next();
        System.out.println("Item? (knife/container/hat/firestarter/blanket)");
        String item = sc.next();

        if (time.equals("day")) {
            if (environment.equals("forest")) {
                if (item.equals("knife")) {
                    System.out.println("Hunt for food");
                } else if (item.equals("container")) {
                    System.out.println("Collect berries");
                } else System.out.println("Explore");
            } else {
                if (item.equals("hat")) {
                    System.out.println("Search for water");
                } else System.out.println("Find shade");
            }
        } else if (time.equals("night")) {
            if (environment.equals("forest")) {
                if (item.equals("firestarter")) {
                    System.out.println("Make a campfire");
                } else System.out.println("Climb a tree for safety");
            } else {
                if (item.equals("blanket")) {
                    System.out.println("Sleep");
                } else System.out.println("Keep moving to stay warm");
            }
        } else System.out.println("error");

        sc.close();
    }
}

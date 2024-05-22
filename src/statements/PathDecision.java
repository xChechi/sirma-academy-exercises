package statements;

import java.util.Scanner;

public class PathDecision {
    public static void main(String[] args) {
        makeDecision();
    }

    private static void makeDecision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What tool you have in your right hand?");
        String leftTool = sc.next();
        System.out.println("What tool you have in your left hand?");
        String rightTool = sc.next();

        if (leftTool.equals("sword")) {
            if (rightTool.equals("shield")) {
                System.out.println("Path to the castle");
            } else System.out.println("Path to the forest");
        } else if (leftTool.equals("map")) {
            if (rightTool.equals("coins")) {
                System.out.println("Go to the town");
            } else System.out.println("Camp");
        } else System.out.println("Wander aimlessly");

        sc.close();
    }
}

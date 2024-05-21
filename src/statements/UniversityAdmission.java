package statements;

import java.util.Scanner;

public class UniversityAdmission {
    public static void main(String[] args) {
        validateScore();
    }

    private static void validateScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();
        System.out.println("How many activities?");
        int activity = sc.nextInt();

        if (score >= 90 || (score >= 80 && activity >= 2)) {
            System.out.println("Admitted");
        } else System.out.println("Not admitted");

        sc.close();
    }
}

package statements;

import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        movieCategorization();
    }

    private static void movieCategorization() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("All movies");
        } else if (age >= 13) {
            System.out.println("U and PG-13 rated movies");
        } else System.out.println("U-rated movies");
        sc.close();
    }
}

package methods;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a grade between 2.00 and 6.00:");
        double grade = sc.nextDouble();

        printGradeInWords(grade);

        sc.close();
    }

    public static void printGradeInWords(double grade) {
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade >= 3.00 && grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade >= 3.50 && grade <= 4.49) {
            System.out.println("Good");
        } else if (grade >= 4.50 && grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade >= 5.50 && grade <= 6.00) {
            System.out.println("Excellent");
        } else {
            System.out.println("Invalid grade");
        }
    }
}

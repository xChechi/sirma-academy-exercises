package statements;

import java.util.Objects;
import java.util.Scanner;

public class ReferenceByAgeAndGender {

    public static void main(String[] args) {
        referenceByInput();
    }

    private static void referenceByInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (gender.equals("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else System.out.println("Master");
        }

        if (gender.equals("f")) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else System.out.println("Miss");
            }
        sc.close();
    }
}

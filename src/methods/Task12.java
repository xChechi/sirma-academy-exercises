package methods;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        validatePassword(password);

        scanner.close();
    }

    private static void validatePassword(String password) {
        boolean isValid = true;
        int digitCount = 0;

        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("Password must contain only letters and digits");
                isValid = false;
                break;
            }
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }
}

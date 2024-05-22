package statements;

import java.util.Scanner;

public class ClimateZone {
    public static void main(String[] args) {
        zoneIndentifier();
    }

    private static void zoneIndentifier() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter latitude (-90/90)");
        double latitude = sc.nextDouble();
        System.out.println("Which hemisphere? (n/s)");
        String hemi = sc.next();

        if (isValidatedInput(latitude, hemi)) {
            if (Math.abs(latitude) >= 66.5) {
                System.out.println("Arctic zone");
            } else if (Math.abs(latitude) >= 23.5) {
                System.out.println("Temperate zone");
            } else if (latitude == 0) {
                System.out.println("Equator");
            } else System.out.println("Tropic zone");
        }
        sc.close();
    }

    private static boolean isValidatedInput(double latitude, String hemi) {
        return latitude >= -90 && latitude <= 90 && (hemi.equals("n") || hemi.equals("s"));
    }
}

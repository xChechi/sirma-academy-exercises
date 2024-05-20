package statements;

import java.util.Scanner;

public class Alarm {

    public static void main(String[] args) {
        alarm();
    }

    private static void alarm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours");
        int hours = sc.nextInt();
        System.out.println("Enter minutes");
        int minutes = sc.nextInt();
        String formattedMinutes;

        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60) {
            minutes +=15;
            if (minutes >= 60) {
                hours++;
                if (hours > 23) {
                    hours = 0;
                }
                minutes -= 60;
                formattedMinutes = String.format("%02d", minutes);
                System.out.println(hours + ":" + formattedMinutes);
            } else System.out.println("enter correct time format");
        }

        sc.close();
    }
}

package statements;

import java.util.Scanner;

public class FigureFace {

    public static void main(String[] args) {
        figureFace();
    }

    private static void figureFace() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose figure type - square, rectangle, circle or triangle");
        String figure = sc.nextLine();

        switch (figure) {
            case "square":
                System.out.println("what is a length of the side ?");
                double side = sc.nextDouble();
                double faceSq = side * side;
                System.out.printf("%.2f", faceSq);
                break;
            case "rectangle":
                System.out.println("what is a length of the side A?");
                double sideA = sc.nextDouble();
                System.out.println("what is a length of the side B?");
                double sideB = sc.nextDouble();
                double faceRec = sideA * sideB;
                System.out.printf("%.2f", faceRec);
                break;
            case "circle":
                System.out.println("what is a radius?");
                double radius = sc.nextDouble();
                double faceCircle = Math.PI * radius * radius;
                System.out.printf("%.2f", faceCircle);
                break;
            case "triangle":
                System.out.println("what is a length of the side A?");
                double sideTriangle = sc.nextDouble();
                System.out.println("what is a height to side A ?");
                double height = sc.nextDouble();
                double faceTriangle = (sideTriangle * height) / 2;
                System.out.printf("%.2f", faceTriangle);
                break;
            default:
                System.out.println("Invalid figure");
        }

        sc.close();
    }
}

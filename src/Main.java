import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        double angle;
        double pi = 3.14;
        double area;

        Scanner givenRadius = new Scanner(System.in);
        System.out.print("Radius: ");
        radius = givenRadius.nextDouble();
        Scanner givenAngle = new Scanner(System.in);
        System.out.print("Center angle: ");
        angle = givenAngle.nextDouble();

        area = (pi * radius * radius * angle)/ 360;
        System.out.println("Area of circle part: " + area);



    }
}

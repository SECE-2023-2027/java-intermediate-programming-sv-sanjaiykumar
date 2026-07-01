import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Square
        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();

        System.out.println("\nArea of Circle: " + AreaCalculator.calculateArea(radius));
        System.out.println("Area of Rectangle: " + AreaCalculator.calculateArea(length, width));
        System.out.println("Area of Square: " + AreaCalculator.calculateArea(side));

        sc.close();
    }
}
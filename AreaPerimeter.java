import java.util.*;
class Shape {
    public double getPerimeter() {
        return 0.0;
    }
    public double getArea() {
        return 0.0;
    }
}
class Square extends Shape {
    private double S;
    public Square(double S) {
        this.S = S;
    }
    public double getPerimeter() {
        return 4 * S;
    }
    public double getArea() {
        return S * S;
    }
}
class Rectangle extends Shape {
    private double L;
    private double W;

    public Rectangle(double L, double W) {
        this.L = L;
        this.W = W;
    }
    public double getPerimeter() {
        return 2 * (L + W);
    }
    public double getArea() {
        return L * W;
    }
}
class Triangle extends Shape {
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public double getPerimeter() {
        return s1 + s2 + s3;
    }
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
}

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape to calculate:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double squareSide = scanner.nextDouble();
                Square square = new Square(squareSide);
                System.out.println("Square Perimeter: " + square.getPerimeter());
                System.out.println("Square Area: " + square.getArea());
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double rectangleLength = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double rectangleWidth = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
                System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
                System.out.println("Rectangle Area: " + rectangle.getArea());
                break;
            case 3:
                System.out.print("Enter the side1 of the triangle: ");
                double triangleSide1 = scanner.nextDouble();
                System.out.print("Enter the side2 of the triangle: ");
                double triangleSide2 = scanner.nextDouble();
                System.out.print("Enter the side3 of the triangle: ");
                double triangleSide3 = scanner.nextDouble();
                Triangle triangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);
                System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
                System.out.println("Triangle Area: " + triangle.getArea());
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }
    }
}

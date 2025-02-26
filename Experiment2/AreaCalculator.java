import java.util.Scanner;

public class AreaCalculator {

    // Method for rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Method for square
    public static double area(double side) {
        return side * side;
    }

    // Method for circle
    public static double area(float radius) {
        return Math.PI * radius * radius;
    }

    // Method for triangle
    public static double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose shape: 1. Rectangle 2. Square 3. Circle 4. Triangle");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1: // Rectangle
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.println("Area of Rectangle: " + area(length, width));
                break;
                
            case 2: // Square
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Area of Square: " + area(side));
                break;
                
            case 3: // Circle
                System.out.print("Enter radius: ");
                float radius = sc.nextFloat();
                System.out.println("Area of Circle: " + area(radius));
                break;
                
            case 4: // Triangle
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Area of Triangle: " + area(base, height, true));
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
}

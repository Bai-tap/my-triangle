import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three point for a triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        if (isValid(side1, side2, side3)) System.out.println("The area of triangle is: " + area(side1, side2, side3));
        else System.out.println("The triangle is not exist");
    }

    public static boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) return true;
        else return false;
    }

    public static double area(double side1, double side2, double side3) {
            double s = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            return area;
    }
}

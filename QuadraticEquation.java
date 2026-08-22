import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Formula: x = (-b +/- sqrt(b^2 - 4ac)) / 2a");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root 1 = " + x1);
            System.out.println("Root 2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Both roots are equal");
            System.out.println("Root = " + x);
        } else {
            System.out.println("Roots are imaginary");
        }
        sc.close();
    }
}

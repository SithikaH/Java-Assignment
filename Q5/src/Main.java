import java.util.Scanner;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    double computeArea() {
        return 3.14 * radius * radius;
    }

    public double computeCircumference() {

       return  2 * 3.14 * radius;
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the inner circle : ");
        double innerR = scanner.nextFloat();

        System.out.print("Enter the radius of the outer circle : ");
        double outerR = scanner.nextFloat();

        Circle innerCircle = new Circle(innerR);
        Circle outerCircle = new Circle(outerR);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();

        double fArea = outerArea - innerArea;

        System.out.println("The area of the circular region is: " + fArea);

        scanner.close();
    }
}
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in centimeters :");
        float length = scanner.nextFloat();

        float inches = length / 2.54f;

        int feet = (int) (inches / 12);
        int remainingInches = (int) (inches % 12);


        System.out.println(length + " cm is equal to " + feet + " feet and " + remainingInches + " inches.");

        scanner.close();
    }
}
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name : ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name : ");
        String lastName = scanner.nextLine();

        int length = middleName.length();
        int mlength = 0;
        char middleChar = middleName.charAt(mlength);

        scanner.close();

        System.out.print(lastName + ", " + firstName + " " + middleChar + ".");


    }
}
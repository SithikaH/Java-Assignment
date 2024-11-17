import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int rows;
    System.out.print("Enter number of rows:");
    rows = input.nextInt();
    int spaces = rows -1;
    int asterisks = 1;

    if (rows <= 0) {
        System.out.println("Rows must be greater than 0");
    }
    else if (rows == 1) {
        System.out.println("*");
    }
    else
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= asterisks; k++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            asterisks +=2;

        }

    }
}
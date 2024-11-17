import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int number;

        do {
            System.out.print("Enter the number: ");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            if (number > 0) {
                int length = lengthNum(number);
                System.out.println("The length of " + number + " is " + length);
            } else
                System.out.println("Length of the number is 0 ");


        } while (number >= 0);

        System.out.println("The number can't be negative");
    }




    public static int lengthNum (int number){

        int count = 0;

        while (number >0){
            number = number/10;
            count++;
        }

        return count;

    }
}
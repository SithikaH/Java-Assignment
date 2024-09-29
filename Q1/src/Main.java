import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd length word: ");
        String word = scanner.nextLine();

        int length = word.length();

        if(length % 2 ==0){
            System.out.print("Please enter an odd length word, error!!!!");
        }
        else {
            int middleIndex = (length - 1)/2;
            char middleChar = word.charAt(middleIndex);
            System.out.print("Middle character : "+ middleChar);

        }

        scanner.close();
    }
}
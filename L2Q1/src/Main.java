//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i <= 49; i++) {
            System.out.print(i + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }

        }
    }
}
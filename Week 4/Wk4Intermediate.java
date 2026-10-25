package dit.pkg2.pkg3_feliciano.Week4;
import java.util.Scanner;

// @author Kyle
public class Wk4Intermediate {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int total = 0;

        System.out.println("===== Sum Until Sentinel Value =====");
        System.out.println("Enter integers to add (enter -1 to stop).");

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // checking before adding, so the sentinel (-1) never reaches the total
        while (number != -1) {
            total += number;

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        System.out.println();
        System.out.println("Final total: " + total);

        /*
         * test input: 10, 5, -5, 20, -1
         * total: 10 + 5 + (-5) + 20 = 30
         * -5 was added normally because only -1 is the sentinel.
         * the -1 itself was not included in the total.
         */

        input.close();
    }
}

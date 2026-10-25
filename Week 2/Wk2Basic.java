package dit.pkg2.pkg3_feliciano.Week2;
import java.util.Scanner;

// @author Kyle
public class Wk2Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Four-Function Calculator =====");

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.println();
        System.out.println("Addition:       " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction:    " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
        System.out.println("Division:       " + a + " / " + b + " = " + (a / b));
        System.out.println("Modulus:        " + a + " % " + b + " = " + (a % b));

        /*
         * Division (/) and modulus (%) behave differently with negative operands.
         * - Integer division truncates toward zero, not toward negative infinity:
         *   -7 / 2 = -3 (not -4).
         * - The result of % takes the sign of the left operand (the dividend):
         *   -7 % 2 = -1, while 7 % -2 = 1.
         * Addition, subtraction, and multiplication follow normal sign rules.
         */

        input.close();
    }
}

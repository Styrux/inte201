package dit.pkg2.pkg3_feliciano.Week2;

// @author Kyle
public class Wk2Advanced {
    public static void main(String[] args) {
        System.out.println("===== Compound Growth & Increment Tracker =====");

        
        double balance = 1000.00;
        System.out.printf("Initial balance:         P%.2f\n", balance);

        balance += 500;   // deposit P500
        System.out.printf("After += 500 (deposit):  P%.2f\n", balance);

        balance *= 1.05;  // 5% interest
        System.out.printf("After *= 1.05 (interest): P%.2f\n", balance);

        balance += 250;   // another deposit
        System.out.printf("After += 250 (deposit):  P%.2f\n", balance);

        balance *= 1.10;  // 10% bonus growth
        System.out.printf("After *= 1.10 (growth):  P%.2f\n", balance);

        System.out.println();

        //postfix vs. prefix increment
        int count = 5;

        System.out.println("--- Postfix (count++) ---");
        System.out.println("Printed value: " + count++);
        System.out.println("count afterwards: " + count);

        System.out.println();

        count = 5; // reset so the comparison is fair

        System.out.println("--- Prefix (++count) ---");
        System.out.println("Printed value: " + ++count);
        System.out.println("count afterwards: " + count);

        /*
         * WHY the two printed values differ:
         * - count++ (postfix) evaluates to the CURRENT value of count (5) first,
         *   and only then increments the variable. So println shows 5, but
         *   count is 6 by the time the next line runs.
         * - ++count (prefix) increments the variable FIRST, then evaluates to the
         *   NEW value (6). So println shows 6, and count is also 6 afterwards.
         * In both cases count ends up as 6; the difference is only in the value
         * the expression itself produces at the moment it is printed.
         */
    }
}

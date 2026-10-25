package dit.pkg2.pkg3_feliciano.Week2;

// @author Kyle
public class Wk2Expert {
    public static void main(String[] args) {
        System.out.println("===== Precedence Puzzle Solver =====");

        // 1st expression: arithmetic + relational + logical
        // prediction: true
        boolean r1 = 10 + 5 * 2 > 18 && 8 % 3 == 2;
        System.out.println("Expression 1: " + r1);

        // 2nd expression: arithmetic + increment
        int x = 5;
        // prediction: r2 = 19, x = 7
        int r2 = x++ + ++x * 2;
        System.out.println("Expression 2: r2 = " + r2 + ", x = " + x);

        // 3rd expression: logical operator precedence
        // prediction: true
        boolean r3 = true || false && false;
        System.out.println("Expression 3: " + r3);

        // 4th expression: arithmetic with * and % at the same level
        // prediction: 4
        int r4 = 2 + 3 * 4 % 5;
        System.out.println("Expression 4: " + r4);
        
    }
}

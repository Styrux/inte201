package dit.pkg2.pkg3_feliciano.Week4;

// @author Kyle
public class Wk4Advanced {
    public static void main(String[] args) {
        int size = 7;

        System.out.println("===== Pattern Generator With Early Exit =====");

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {

                // Break: stop the inner loop once column 5 is reached
                if (col == 5) {
                    break;
                }

                // Continue: skip printing column 3 (the loop moves to the next column)
                if (col == 3) {
                    continue;
                }

                System.out.print("** // ** ");
            }
            System.out.println(); // end the current row
        }
    }
}
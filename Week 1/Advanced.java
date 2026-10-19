package dit.pkg2.pkg3_feliciano.Week1;

/**
 *
 * @author Kyle
 */
public class Wk1Advanced {
    public static void main(String[] args) {
       //Explicit Casting
        double totalCentimeters = 226.67;
        int wholeMeters = (int) (totalCentimeters / 100);
        double remainingCentimeters = totalCentimeters % 100;

        System.out.println("=== Unit Converter Output ===");
        System.out.println("Total Centimeters: " + totalCentimeters + " cm");
        System.out.println("Converted Result:  " + wholeMeters);
        System.out.println("Remainder (cm):  " + remainingCentimeters);

        //Implicit Widening 
        int wholeMetersInput = 5;
        double metersAsDouble = wholeMetersInput;
        System.out.println("\n=== Implicit Widening Output ===");
        System.out.println("Implicit Widening Result: " + metersAsDouble);
        /*
         * Explanation:
         * No explicit cast is needed because double (64-bit floating point) has a larger size 
         * and range than int (32-bit integer). Java automatically promotes the int value to a double 
         * without any risk of data loss.
         */

        System.out.println();

        //Explicit Narrowing
        double measurementInMeters = 5.89;
        int truncatedMeters = (int) measurementInMeters;
        System.out.println("=== Explicit Narrowing Output ===");
        System.out.println("Explicit Narrowing Result: " + truncatedMeters + "\n");
        /*
         * Explanation:
         * Explicit casting (int) is required because converting a double to an int moves from a 
         * larger, floating-point data type to a smaller integer data type. 
         * Exact data lost: The fractional/decimal portion (.89) is completely discarded (truncated), 
         * losing precision.
         */
           }
    
}

package dit.pkg2.pkg3_feliciano.Week1;
//@author Kyle
public class Wk1Expert {
        public static void main(String[] args) {

        System.out.println("--- PRIMITIVE OVERFLOW ---");
        byte maxByte = 127; 
        System.out.println("Initial byte value: " + maxByte);

        maxByte++;
        System.out.println("Byte value after incrementing (overflow): " + maxByte);
        System.out.println();

        System.out.println("--- STRING REFERENCE COMPARISON DEMO ---");
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";

        System.out.println("str1 == str2: " + (str1 == str2));
        /*
         * WHY str1 == str2 is FALSE:
         * The '==' operator compares memory references. Since str1 and str2 were created using 
         * 'new String(...)', Java allocated two distinct object instances on the heap at separate memory addresses.
         */
        System.out.println("str1.equals(str2): " + str1.equals(str2));

        System.out.println("str1 == str3: " + (str1 == str3));
        /*
         * WHY str1 == str3 is FALSE:
         * str3 points to a String object in the String Pool (literal pool), whereas str1 points to 
         * an explicitly created object instance on the heap. Because they refer to different memory locations, '==' returns false.
         */
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        // Comparing str2 and str3
        System.out.println("str2 == str3: " + (str2 == str3));
        /*
         * WHY str2 == str3 is FALSE:
         * Same reason as above: str2 is an explicit heap object created with 'new', while str3 
         * references the String Pool entry. Their memory addresses are different.
         */
        System.out.println("str2.equals(str3): " + str2.equals(str3));
        System.out.println();

        System.out.println("--- 3. SHARED ARRAY REFERENCE DEMO ---");
        int[] originalArray = {10, 20, 30};
        int[] sharedArray = originalArray; // Both variables now reference the same array on the heap

        System.out.println("Original array before modification: " + java.util.Arrays.toString(originalArray));
        System.out.println("Shared array before modification:   " + java.util.Arrays.toString(sharedArray));

        sharedArray[0] = 99;

        System.out.println("\n[Modified sharedArray[0] to 99]");
        System.out.println("Original array after modification:  " + java.util.Arrays.toString(originalArray));
        System.out.println("Shared array after modification:    " + java.util.Arrays.toString(sharedArray));
    }
}

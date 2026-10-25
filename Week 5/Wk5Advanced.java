package dit.pkg2.pkg3_feliciano.Week5;
import java.util.Arrays;
// @author Kyle
public class Wk5Advanced {
    public static void main(String[] args) {
          int[] scores = {85, 92, 78, 65, 99, 88, 73, 90, 81};
        int target = 88;

        System.out.println("===== Search & Sort Mini-Tool =====");

        // Part 1: linear search on the original array
        int foundIndex = -1; // -1 means "not found"

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break; // stop at the first match
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index " + foundIndex);
        } else {
            System.out.println("Target " + target + " was not found");
        }

        System.out.println();

        // Part 2: Sort a copy not the original
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted:   " + Arrays.toString(sortedScores));

        /*
         * Arrays.sort() rearranges the array in place, so sorting the original
         * would destroy its order. The index found by the linear search only
         * makes sense for the original order (88 is at index 5 there, but at a
         * different index after sorting). Sorting a copy keeps the original
         * data and its indexes intact, so we can still compare, re-search, or
         * report positions in the order the scores were first entered.
         * Note: "int[] sorted = scores;" would NOT make a copy. It would only
         * create a second reference to the same array.
         */
    }
}

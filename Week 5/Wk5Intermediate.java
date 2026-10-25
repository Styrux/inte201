package dit.pkg2.pkg3_feliciano.Week5;

// @author Kyle
public class Wk5Intermediate {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 99, 88, 73, 90, 81};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // cast to double before dividing to avoid integer division
        double average = (double) sum / scores.length;

        System.out.println("===== Class Statistics Calculator =====");
        System.out.println("Number of scores: " + scores.length);
        System.out.println("Sum:              " + sum);
        System.out.printf("Average:          %.2f%n", average);
        System.out.println("Highest score:    " + highest);
        System.out.println("Lowest score:     " + lowest);
    }
}

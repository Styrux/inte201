package dit.pkg2.pkg3_feliciano.Week2;

// @author Kyle
public class Wk2Intermediate {
    public static void main(String[] args) {
        double average = 82.5;
        int absences = 2;

        System.out.println("===== Grade Threshold Checker =====");
        System.out.println("Average: " + average);
        System.out.println("Absences: " + absences);
        System.out.println();

        boolean pwedeNa = (average >= 75 && absences <= 3);
        boolean magaling = (average >= 90);

        if (pwedeNa || magaling) {
            System.out.println("Result: PASS");
            if (magaling) {
                System.out.println("Reason: Average grade is 90 or above, so absences don't matter.");
            } else {
                System.out.println("Reason: Average grade is at least 75 and absences are 3 or fewer.");
            }
        } else {
            System.out.println("Result: FAIL");
            if (average < 75) {
                System.out.println("Reason: Average grade is below 75 and not high enough (90+) to excuse it.");
            } else {
                System.out.println("Reason: Too many absences (more than 3), and average is below 90.");
            }
        }
    }
    
    
}

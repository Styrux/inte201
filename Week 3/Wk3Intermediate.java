package dit.pkg2.pkg3_feliciano.Week3;

// @author Kyle
public class Wk3Intermediate {
    public static void main(String[] args) {
        double purchaseAmount = 2647.94;
        double discountRate;
        String tier;

        // ladder is ordered from highest threshold to lowest so every tier is reachable
        if (purchaseAmount >= 5000) {
            discountRate = 0.15;
            tier = "15% off";
        } else if (purchaseAmount >= 2000) {
            discountRate = 0.10;
            tier = "10% off";
        } else if (purchaseAmount >= 1000) {
            discountRate = 0.05;
            tier = "5% off";
        } else {
            discountRate = 0.0;
            tier = "Regular (no discount)";
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discountRate);

        System.out.println("===== Multi-Tier Discount System =====");
        System.out.printf("Purchase Amount: P%.2f%n", purchaseAmount);
        System.out.println("Discount Tier:   " + tier);
        System.out.printf("Final Price:     P%.2f%n", finalPrice);

    }
}

package dit.pkg2.pkg3_feliciano.Week3;

// @author Kyle
public class Wk3Expert {
    public static void main(String[] args) {
         // Stored account data
        String correctUsername = "kyle";
        String correctPin = "4146";
        double balance = 25000.00;

        // Values being tested
        String inputUsername = "kyle";
        String inputPin = "4146";
        double withdrawAmount = 8000.00;

        String tier = "";
        double feePercent = 0;
        double dailyLimit = 0;
        double fee = 0;
        boolean approved = false;
        String denialReason = "";

        System.out.println("===== ATM Transaction Authorizer =====");

        // Stage 1: username
        if (inputUsername.equals(correctUsername)) {

            // Stage 2: PIN (only checked if username matched)
            if (inputPin.equals(correctPin)) {

                // determine tier from balance (highest threshold first)
                if (balance >= 100000) {
                    tier = "Platinum";
                } else if (balance >= 50000) {
                    tier = "Gold";
                } else if (balance >= 10000) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }

                // slect fee percentage and daily limit based on tier
                switch (tier) {
                    case "Platinum":
                        feePercent = 0.0;
                        dailyLimit = 50000;
                        break;
                    case "Gold":
                        feePercent = 1.0;
                        dailyLimit = 20000;
                        break;
                    case "Silver":
                        feePercent = 1.5;
                        dailyLimit = 10000;
                        break;
                    case "Bronze":
                        feePercent = 2.0;
                        dailyLimit = 5000;
                        break;
                }

                fee = withdrawAmount * (feePercent / 100);
                double totalDeduction = withdrawAmount + fee;

                // withdrawal logic: balance first, then daily limit
                if (totalDeduction <= balance) {
                    if (withdrawAmount <= dailyLimit) {
                        approved = true;
                    } else {
                        denialReason = "Amount exceeds the " + tier
                                + " daily limit of P" + dailyLimit + ".";
                    }
                } else {
                    denialReason = "Insufficient balance (amount + fee is P"
                            + totalDeduction + ").";
                }

            } else {
                denialReason = "Incorrect PIN.";
            }

        } else {
            denialReason = "Username not found.";
        }

        // final decision
        if (approved) {
            System.out.println("Tier:       " + tier);
            System.out.printf("Fee (%.1f%%): P%.2f%n", feePercent, fee);
            System.out.printf("New balance: P%.2f%n", balance - withdrawAmount - fee);
            System.out.println("Result: APPROVED");
        } else {
            System.out.println("Result: DENIED");
            System.out.println("Reason: " + denialReason);
        }
    }
}

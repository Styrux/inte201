package dit.pkg2.pkg3_feliciano.Week1;

//@author Kyle
public class Wk1Intermediate {
    public static void main(String[] args) {
     System.out.println("===== Type-Safe Shopping Calculator ===== \n ");
     String storeName = "FeliMart";
        int quantity = 3;
        double unitPrice = 22.67;

        double totalCost = quantity * unitPrice;

        System.out.println("===== Purchase Summary =====");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity:   " + quantity);
        System.out.println("Unit Price: P" + unitPrice);
        System.out.println("Total Cost: P" + totalCost);

        /*
         * totalCost shouldn't be declared as an int because unitPrice is a 
         * double (floating-point number)
         * Multiplying an int by a double results in a double. If totalCost 
         * were declared as an int, Java would require an explicit cast, which 
         * would truncate the decimal precision (cents) 
         * and produce an inaccurate calculation.
         */   
    }
}

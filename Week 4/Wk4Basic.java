package dit.pkg2.pkg3_feliciano.Week4;

// @author Kyle
public class Wk4Basic {
    public static void main(String[] args) {
         int limit = 10; 

        System.out.println("===== Number & Square Printer (Limit: 10) =====");

        for (int i = 1; i <= limit; i++) {
            System.out.println("Number: " + i + " | Square: " + (i * i));
        }
        
        limit = 20;
        
        System.out.println("\n===== Number & Square Printer (Limit: 20) =====");

        for (int i = 1; i <= limit; i++) {
            System.out.println("Number: " + i + " | Square: " + (i * i));
        }
    }
}



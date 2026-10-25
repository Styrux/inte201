package dit.pkg2.pkg3_feliciano.Week4;

import java.util.Scanner;

// @author Kyle
public class Wk4Expert {

    static final int LOW_THRESHOLD = 5;
    static Scanner input = new Scanner(System.in);

    // for + continue: total inventory, skipping damaged shelves
    static int totalInventory(int[][] warehouse) {
        int total = 0;
        for (int r = 0; r < warehouse.length; r++) {
            for (int c = 0; c < warehouse[r].length; c++) {
                if (warehouse[r][c] == -1) {
                    continue; // CONTINUE: skip damaged shelf
                }
                total += warehouse[r][c];
            }
        }
        return total;
    }

    // nested loops + break: find the FIRST critically low (non-damaged) shelf
    static void findFirstLowShelf(int[][] warehouse) {
        int foundRow = -1;
        int foundCol = -1;

        for (int r = 0; r < warehouse.length && foundRow == -1; r++) {
            for (int c = 0; c < warehouse[r].length; c++) {
                if (warehouse[r][c] != -1 && warehouse[r][c] < LOW_THRESHOLD) {
                    foundRow = r;
                    foundCol = c;
                    break; // BREAK: stop the inner loop; outer loop ends via foundRow
                }
            }
        }

        if (foundRow != -1) {
            System.out.println("First critically low shelf: Row " + foundRow
                    + ", Col " + foundCol + " (count: " + warehouse[foundRow][foundCol] + ")");
        } else {
            System.out.println("No critically low shelves found.");
        }
    }

    // Reads an int safely, re-asking until the user types a whole number
    static int readInt(String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.print("Invalid input. " + prompt);
            input.next(); // discard the bad token
        }
        return input.nextInt();
    }

    // while + return: restock with input validation
    static void restock(int[][] warehouse) {
        while (true) {
            int row = readInt("Enter row (-1 to cancel): ");
            if (row == -1) {
                System.out.println("Restock cancelled.");
                return; // RETURN: leave the method early
            }

            int col = readInt("Enter column: ");

            if (row < 0 || row >= warehouse.length
                    || col < 0 || col >= warehouse[row].length) {
                System.out.println("That shelf does not exist. Try again.");
                continue;
            }
            if (warehouse[row][col] == -1) {
                System.out.println("That shelf is damaged and cannot be restocked.");
                continue;
            }

            int amount = readInt("Enter amount to add: ");
            if (amount <= 0) {
                System.out.println("Amount must be greater than 0. Try again.");
                continue;
            }

            warehouse[row][col] += amount;
            System.out.println("Restocked. New count: " + warehouse[row][col]);
            return; // RETURN: restock succeeded
        }
    }

    public static void main(String[] args) {
        int[][] warehouse = {
            {20, 15, -1, 8},
            {3, 12, 25, -1},
            {10, 2, 18, 30}
        };

        int choice;

        // do-while: menu shows at least once and repeats until Exit
        do {
            System.out.println("\n===== Warehouse Inventory Scanner =====");
            System.out.println("1. Show total inventory");
            System.out.println("2. Find first critically low shelf");
            System.out.println("3. Restock a shelf");
            System.out.println("4. Exit");
            choice = readInt("Choose an option: ");

            switch (choice) {
                case 1:
                    System.out.println("Total inventory: " + totalInventory(warehouse));
                    break;
                case 2:
                    findFirstLowShelf(warehouse);
                    break;
                case 3:
                    restock(warehouse);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Choose 1-4.");
            }
        } while (choice != 4);

        input.close();
    }
}
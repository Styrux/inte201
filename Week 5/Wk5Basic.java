package dit.pkg2.pkg3_feliciano.Week5;

// @author Kyle
public class Wk5Basic {
    public static void main(String[] args) {
        String[] favorites = {"Pizza", "Burger", "Games", "Medicine", "Sir Victor"};

        System.out.println("===== My Favorite Things =====");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println();
        System.out.println("Total favorites: " + favorites.length);
    }
}



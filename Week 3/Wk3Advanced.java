package dit.pkg2.pkg3_feliciano.Week3;

// @author Kyle
public class Wk3Advanced {
     public static void main(String[] args) {
        // correct credentials
        String correctUsername = "kyleCNF";
        String correctPassword = "_kCNF412";
        boolean accountLocked = false;

        // wrong username and password
        String inputUsername = "sirVictorPogi";
        String inputPassword = "inte201";

        System.out.println("===== Nested Login Validator =====");
        System.out.println("Username entered: " + inputUsername);

        // Stage 1: username
        if (inputUsername.equals(correctUsername)) {

            // Stage 2: password (only checked if username matched)
            if (inputPassword.equals(correctPassword)) {

                // Stage 3: account status (only checked if both matched)
                if (!accountLocked) {
                    System.out.println("Login successful. Welcome, " + inputUsername + "!");
                } else {
                    System.out.println("Login failed: Your account is locked.");
                }

            } else {
                System.out.println("Login failed: Incorrect password.");
            }

        } else {
            System.out.println("Login failed: Username not found.");
        }

        // wrong password
        inputUsername = "kyleCNF";
        inputPassword = "inte201";

        System.out.println("\n\n===== Nested Login Validator =====");
        System.out.println("Username entered: " + inputUsername);

        // Stage 1: username
        if (inputUsername.equals(correctUsername)) {

            // Stage 2: password (only checked if username matched)
            if (inputPassword.equals(correctPassword)) {

                // Stage 3: account status (only checked if both matched)
                if (!accountLocked) {
                    System.out.println("Login successful. Welcome, " + inputUsername + "!");
                } else {
                    System.out.println("Login failed: Your account is locked.");
                }

            } else {
                System.out.println("Login failed: Incorrect password.");
            }

        } else {
            System.out.println("Login failed: Username not found.");
        }

         // correct both
        inputUsername = "kyleCNF";
        inputPassword = "_kCNF412";

        System.out.println("\n\n===== Nested Login Validator =====");
        System.out.println("Username entered: " + inputUsername);

        // Stage 1: username
        if (inputUsername.equals(correctUsername)) {

            // Stage 2: password (only checked if username matched)
            if (inputPassword.equals(correctPassword)) {

                // Stage 3: account status (only checked if both matched)
                if (!accountLocked) {
                    System.out.println("Login successful. Welcome, " + inputUsername + "!");
                } else {
                    System.out.println("Login failed: Your account is locked.");
                }

            } else {
                System.out.println("Login failed: Incorrect password.");
            }

        } else {
            System.out.println("Login failed: Username not found.");
        }
    }
}

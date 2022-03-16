import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String password = "QWERTY";
        String attempt = "";
        int failedAttempts = 0;
        boolean loggedIn = false;
        while(loggedIn == false) {
            System.out.println("Current failed attempts: " + failedAttempts);
            System.out.println("Please enter the password:");
            attempt = userInput.nextLine();
            if (attempt.equals(password)) {
                System.out.println("Logged in!");
                loggedIn = true;
            } else {
                System.out.println("The entered password is incorrect");
                failedAttempts += 1;
            }
        }
    }
}

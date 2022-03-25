package BobAndAlice;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userName = "";
        boolean isBobOrAlice = false;
        while(isBobOrAlice == false){
            System.out.println("Enter your name: ");
            userName = userInput.nextLine();
            if (userName.equalsIgnoreCase("Bob") || userName.equalsIgnoreCase("Alice")){
                System.out.println("Hello and welcome " + userName + "!");
                isBobOrAlice = true;
            }
            else {
                System.out.println("Not who I was expecting.....");
            }
        }
    }
}

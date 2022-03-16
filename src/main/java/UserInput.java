import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("what is your name?");

        String response =  userInput.nextLine();

        System.out.println("What's your lucky number");
        int luckyNumber = userInput.nextInt();

        System.out.println("Your name is " + response + "\n" + " and your lucky number is " + luckyNumber);
        userInput.close();
    }
}
import java.util.Scanner;
public class InClass {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String product = "";
        System.out.println("What's the item called?");
        product = userInput.nextLine();
        int qty = 0;
        System.out.println("What's the item's quantity");
        qty = userInput.nextInt();
        float price = 0.0f;
        System.out.println("What's the item's price?");
        price = userInput.nextFloat();
        float total = qty * price;
        String output = String.format("%s %8s %10s %10s","Product","QTY","Price","Total");
        String output1 = String.format("%s %11s %10s %10s","----","---","-----","-----");
        String output2 = String.format("%s %12d %10.1f %10.1f",product,qty,price,total);
        System.out.println(output);
        System.out.println(output1);
        System.out.println(output2);
    }
}

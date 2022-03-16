package vehicles;

public class Example {
    public static void main(String[] args) {
        int days = 4;
        switch (days) {  // Switch Statement
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Not a week day");
        }
        int age = 19;
        if (age > 21){  // If Else If Statement
            System.out.println("Can drink");
        }
        else if (age == 21){
            System.out.println("You can start drinking");
        }
        else {
            System.out.println("Underage");
        }
        String canDrink = (age > 17) ? "Can party" : "Cannot party";  //Ternary Statement
        System.out.println(canDrink);
    }
}

package drill;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        System.out.println(chicken.makeNoise());
        Cow cow = new Cow();
        System.out.println(cow.makeNoise());
    }
}

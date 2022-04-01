package car;

public class Dealership {
    public static void main(String[] args) {
        Cars ford = new Cars();
        ford.setName("Ford 2009 SE");
        ford.setColor("Blue");
        System.out.println(ford.getName());
        System.out.println(ford.getColor());
        ford.getRandomSong();
    }
}

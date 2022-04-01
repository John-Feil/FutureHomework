package animals;

public class Farm {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("jackie");
        System.out.println(dog.getName());
        dog.move();
        System.out.println(dog.makeNoise());
    }
}


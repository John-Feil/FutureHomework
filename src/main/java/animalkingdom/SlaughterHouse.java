package animalkingdom;

public class SlaughterHouse {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Human");
        wolf.setFood("human");
        wolf.eat();
        Wolf wolf2 = new Wolf("Cats");
        wolf2.eat();
        Lion lion = new Lion("Dog");
        // Animal animal = new Animal(); can't do as animal is a abstract concept
        printAnimalFood(wolf);
        RoboDog roboDog = new RoboDog();
        Animal[] animals = {wolf,lion};
        IPet[] pets = {wolf,lion,roboDog};
        printEachGreeting(pets);
        wolf.eat();
    }
    public static void printEachGreeting(IPet[] pets){
        for (IPet p: pets){
            p.greetOwner();
        }

    }
    public static void printAnimalFood(Animal animal){
        if(animal instanceof Lion){
            System.out.println(animal.getFood());
        }else if (animal instanceof Wolf){
            System.out.println(animal.getFood());
        }
    }
}

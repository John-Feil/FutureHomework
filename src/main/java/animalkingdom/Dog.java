package animalkingdom;

public class Dog extends Canine implements IPet{
    @Override
    public void eat() {
        System.out.println("Dogs eat bones");
    }

    @Override
    public void greetOwner() {
        System.out.println("Wolf");
    }
}

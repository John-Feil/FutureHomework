package animalkingdom;

public class Lion extends Feline implements IPet{

    public Lion(String food){
        this.setFood(food);
    }

    @Override
    public void eat(){
        System.out.println("Eats " + this.getFood());
    }

    @Override
    public void greetOwner() {
        System.out.println("Roar!");
    }
}

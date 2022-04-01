package animalkingdom;

public class Wolf extends Canine implements IPet{

    public Wolf(String food){
        this.setFood(food);
    }
    @Override
    public void eat(){
        System.out.println("Wolf eats " + this.getFood());
    }

    @Override
    public void greetOwner() {
        System.out.println("WOLF!");
    }
}

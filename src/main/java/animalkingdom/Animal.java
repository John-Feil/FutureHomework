package animalkingdom;
// super or parent class
public abstract class Animal {
    //instance variable or properties, state, field, attribute
    private String food;

    //default constructor


    //method
    public abstract void eat();

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void printFood(Animal[] animals){
        for (Animal a: animals){
            a.getFood();
        }
    }
}

package animals;

public class Animal {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void move(){
        System.out.println("I'm moving around!");
    }
    public String makeNoise(){
        return "and making noise!";
    }
}

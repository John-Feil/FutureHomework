package labs;

public class Square extends Shape{
    @Override
    public void calcArea(){
        System.out.println(this.getSide() * this.getSide());
    }
}

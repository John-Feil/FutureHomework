package labs;

public class Circle extends Shape{
    @Override
    public void calcArea() {
        System.out.println(Math.PI * getSide() * getSide());
    }
}

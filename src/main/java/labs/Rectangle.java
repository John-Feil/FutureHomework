package labs;

public class Rectangle extends Shape{
    private double width;

    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }

    @Override
    public void calcArea() {
        System.out.println(getSide() * getWidth());;
    }
}

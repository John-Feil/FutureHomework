package labs;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(20.0);

        Circle circle = new Circle();
        circle.setSide(7.0);

        Rectangle rectangle = new Rectangle();
        rectangle.setSide(10.0);
        rectangle.setWidth(5);

        Shape[] shapes = {square, circle, rectangle};

        for (Shape shape: shapes){
            shape.calcArea();
        }
    }
}

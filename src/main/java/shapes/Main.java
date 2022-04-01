package shapes;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square();
        System.out.println(square.calculateArea(10.0));
        Shape cube = new Cube();
        System.out.println(cube.calculateArea(8));
    }
}

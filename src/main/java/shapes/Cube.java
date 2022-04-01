package shapes;

public class Cube extends ThreeDShapes{

    @Override
    public double calculateArea(double i) {
        return (6 * (i * i));
    }
}

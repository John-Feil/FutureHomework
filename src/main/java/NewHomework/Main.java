package NewHomework;

public class Main {
    public static void main(String[] args) {
        Calculator twoDigits = new Calculator(10.0d,3.0d);
        System.out.println(twoDigits.Add());
        System.out.println(twoDigits.Subtract());
        System.out.println(twoDigits.Multiply());
        System.out.println(twoDigits.Divide());
        System.out.println(twoDigits.exponents());
        Calculator oneDigit = new Calculator(25.0d);
        System.out.println(oneDigit.square());
        System.out.println(oneDigit.squareRoot());

    }
}

package NewHomework;

public class Calculator {
    private double numberOne;
    private double numberTwo;

    public Calculator(double numberOne){
        this.numberOne = numberOne;
    }

    public Calculator(double numberOne,double numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double Add(){
        return this.numberOne + this.numberTwo;
    }
    public double Subtract(){
        return numberOne - numberTwo;
    }
    public double Multiply(){
        return numberOne * numberTwo;
    }
    public double Divide(){
        return numberOne / numberTwo;
    }
    public double square(){
        return numberOne * numberOne;
    }
    public double squareRoot(){
        return Math.sqrt(numberOne);
    }
    public double exponents(){
        return Math.pow(numberOne,numberTwo);
    }

    public double getNumberTwo() {
        return numberTwo;
    }
    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }
    public double getNumberOne() {
        return numberOne;
    }
    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }
}

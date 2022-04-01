package employeedemo;

public class Entrepreneur extends Person implements IPayable{
    private double income;

    public Entrepreneur(String name, double income) {
        super(name);
        this.income = income;
    }

    @Override
    public void calculatePay() {
        setIncome(this.income);
    }

    @Override
    public void printPay() {
        System.out.println("The pay is " + this.income);
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}

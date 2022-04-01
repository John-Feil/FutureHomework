package employeedemo;

public class SalariedEmployee extends Employee implements IPayable{
    private double salary;

    public SalariedEmployee(String name, double salary){
        super(name);
        this.salary = salary;
    }
    @Override
    public void calculatePay() {
        setSalary(this.salary);
    }

    @Override
    public void printPay() {
        System.out.println("The pay is " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

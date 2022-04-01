package employeedemo;

public class HourlyEmployee extends Employee implements IPayable{
    private double hourlyRate;
    private double hoursWorked;
    private double salary;

    public HourlyEmployee(String name,double hoursWorked,double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        salary = hourlyRate * hoursWorked;
    }

    @Override
    public void printPay() {
        System.out.println("The pay is " + salary);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

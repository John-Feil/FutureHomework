package oop;

public class Employee extends Person{

    private float hoursWorked;
    private double hourlyRate;

    public Employee(String name, float hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }









    @Override
    public String toString() {
        //return super.toString() + " whatever";
        return "Employee's name is : " + getName();
    }
}

package employeedemo;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee sEmployee = new SalariedEmployee("Rob",40000.0);
        HourlyEmployee hEmployee = new HourlyEmployee("John", 500.0,30.0);
        Entrepreneur entrepreneur = new Entrepreneur("Charles",50000.0);
        sEmployee.calculatePay();
        sEmployee.printPay();
        sEmployee.issueBadge();
        hEmployee.calculatePay();
        hEmployee.printPay();
        hEmployee.issueBadge();
        entrepreneur.calculatePay();
        entrepreneur.printPay();
        System.out.println(entrepreneur.getName(););
    }
}

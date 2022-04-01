package employeedemo;

public abstract class Employee extends Person{
    public Employee(String name) {
        super(name);
    }


    public void issueBadge(){
        System.out.println("Issuing badge for: " + getName());
    }
}

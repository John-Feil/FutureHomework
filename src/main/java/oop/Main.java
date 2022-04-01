package oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        person1.printPersonProfile();
        Person person2 = new Person("Kyle",20);
        person2.printPersonProfile();
        System.out.println(person2);
        Person person3 = new Person();
        person3.printPersonProfile();
        Employee employee = new Employee("John", 40.0f,35);
        System.out.println(employee);
        employee.sex = 'M';
        employee.setPronoun("Non Binary");
        System.out.println(employee.getPronoun());
    }
}

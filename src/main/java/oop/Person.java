package oop;

public class Person {
    private String name;
    private int age;
    protected char sex;
    private String pronoun;

    public String getPronoun(){
        return pronoun;
    }

    public void setPronoun(String pronoun){
        this.pronoun = pronoun;
    }

    @Override
    public String toString(){
        return this.name + ", age  " + this.age;
    }
    public void printPersonProfile(){
        System.out.println(this.name + " is " + this.getAge());
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

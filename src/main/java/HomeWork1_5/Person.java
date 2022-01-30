package HomeWork1_5;

public class Person {
    private String name;
    private String position;
    private String email;
    private long telephone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, long telephone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

        //this (name, position, email, telephone, salary, age); - Почему такая конструкция не работает?
    }

    public void printInfoPerson(){
        System.out.println("Name: " + name + "\nPosition: " + position + "\nEmail: " + email + "\nTelephon: " + telephone + "\nSalary: " + salary + "\nAge: " + age);

    }

    public int getAge() {
        return age;
    }

}

package Entities.Childs;

public class Human {
    private String name;
    private int age;
    private String job;
    private double salary;

    public Human(String name, int age, String job, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
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
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    public void work() {
        System.out.println(name + " is working as a " + job + ".");
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

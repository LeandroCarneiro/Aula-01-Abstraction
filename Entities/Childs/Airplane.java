package Entities.Childs;

public class Airplane {
    private String make;
    private String model;
    private int year;
    private double price;

    public Airplane(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void fly() {
        System.out.println(make + " " + model + " is flying.");
    }
    public void land() {
        System.out.println(make + " " + model + " is landing.");
    }
    public void takeOff() {
        System.out.println(make + " " + model + " is taking off.");
    }
}

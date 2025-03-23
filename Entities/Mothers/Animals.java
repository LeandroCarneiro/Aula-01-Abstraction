package Entities.Mothers;

public class Animals {
    private String species;
    private String habitat;
    private int age;
    private double weight;

    public Animals(String species, String habitat, int age, double weight) {
        this.species = species;
        this.habitat = habitat;
        this.age = age;
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
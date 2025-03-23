package Entities.Childs;

public class Bird {
    private String species;
    private String habitat;
    private int age;
    private double weight;

    public Bird(String species, String habitat, int age, double weight) {
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
    
    public void fly() {
        System.out.println(species + " is flying.");
    }
}

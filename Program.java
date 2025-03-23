import Entities.Childs.Airplane;
import Entities.Childs.Bird;
import Entities.Childs.Car;
import Entities.Childs.Human;

public class Program {
    public static void main(String[] args) {
        // Create a Human object
        Human human = new Human("John", 30, "Engineer", 70000);

        System.out.println("Human Name: " + human.getName());
        System.out.println("Human Age: " + human.getAge());
        System.out.println("Human Job: " + human.getJob());
        System.out.println("Human Salary: " + human.getSalary());
        
        human.sleep();
        human.work();   
        human.eat();
        
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 2020, 24000);
        
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Price: " + car.getPrice());
        
        car.drive();
        car.park();
        car.refuel();

        // Create an Airplane object
        Airplane airplane = new Airplane("Boeing", "747", 2018, 300000000);
        
        airplane.fly(900);
        airplane.land();
        airplane.takeOff();

        // Create a Bird object
        Bird bird = new Bird("Parrot", "Green", 2, 0.5);

        System.out.println("Bird Species: " + bird.getSpecies());
        System.out.println("Bird Age: " + bird.getAge());
        System.out.println("Bird Habitat: " + bird.getHabitat());
        System.out.println("Bird Weight: " + bird.getWeight());

        bird.fly();     
    }
}

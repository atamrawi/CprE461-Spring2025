/**
 * A class representing a car that is a Vehicle and is refuelable.
 */
public class Car extends Vehicle implements IRefuelable {

    /**
     * The fuel level of the car in liters.
     */
    private int fuelLevel;

    /**
     * Constructor for the Car class.
     * 
     * @param make The {@link Make} of the car.
     * @param model The {@link Model} of the car.
     */
    public Car(Make make, Model model) {
        super(make, model);
        this.fuelLevel = 0;
    }

    @Override
    public void start() {
        // Method overriding (Polymorphism)
        System.out.println(make + " " + model + " car started.");
    }

    @Override
    public void refuel(int amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Invalid amount to refuel.");
        }
        fuelLevel += amount;
        System.out.println("Refueled " + amount + " liters. Fuel level: " + fuelLevel);
    }

    /**
     * Drives the car a certain distance.
     * 
     * @param distance The distance to drive in kilometers.
     * @throws IllegalArgumentException If the distance is less than or equal to zero.
     */
    public void drive(int distance) {
        // Method overloading (Polymorphism)
        if(distance <= 0) {
            throw new IllegalArgumentException("Invalid distance to drive.");
        }
        System.out.println("Driving " + distance + " kilometers.");
    }

    /**
     * Drives the car to a destination.
     * 
     * @param destination The destination to drive to as a {@link String}.
     */
    public void drive(String destination) {
        System.out.println("Driving to " + destination + ".");
    }

}
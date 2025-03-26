/**
 * A class representing a truck that is a Vehicle.
 */
class Truck extends Vehicle {

    /**
     * Constructor for the Truck class.
     * 
     * @param make The {@link Make} of the truck.
     * @param model The {@link Model} of the truck.
     */
    public Truck(String make, String model) {
        super(make, model);
    }

    @Override
    void start() {
        // Method overriding (Polymorphism)
        System.out.println(make + " " + model + " truck started.");
    }
    
}
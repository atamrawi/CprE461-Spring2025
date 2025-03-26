/**
 * This base class represents a vehicle.
 * <p>
 * It also demonstrates inheritance and polymorphism for the sake of Problem 4.
 */
public abstract class Vehicle {

    /**
     * The make of the vehicle as an enumeration item of {@link Make}.
     * <p>
     * For example: {@link Make#Toyota}, {@link Make#Ford}, etc.
     */
    protected Make make;

    /**
     * The model of the vehicle as an enumeration item of {@link Model}.
     * <p>
     * For example: Corolla, F-150, etc.
     */
    protected Model model;

    /**
     * Constructor for the Vehicle class.
     * 
     * @param make The {@link Make} of the car.
     * @param model The {@link Model} of the car.
     */
    public Vehicle(Make make, Model model) {
        this.make = make;
        this.model = model;
    }

    /**
     * Starts the vehicle.
     * <p>
     * This method is abstract and demonstrates polymorphism via overriding in sub-classes.
     */
    abstract void start();
    
}
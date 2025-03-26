/**
 * An interface for refuelable vehicles.
 * <p>
 * It demonstrates interface implementation for the sake of Problem 4.
 */
public interface IRefuelable {

    /**
     * Refuels the vehicle with the given amount of fuel.
     * 
     * @param amount The amount of fuel to refuel in liters.
     */
    public void refuel(int amount);
}
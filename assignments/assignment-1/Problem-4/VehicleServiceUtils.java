/**
 * This class contains a set of utilities for vehicle services.
 * <p>
 * It demonstrates Data Coupling and Stamp Coupling
 */
public class VehicleServiceUtils {

    /**
     * A private constructor to prevent instantiation of this utility class.
     */
    private VehicleServiceUtils() {
        throw new UnsupportedOperationException("Cannot instantiate VehicleServiceUtils utility class.");
    }

    /**
     * Checks the tire pressure of a specific tire.
     * <p>
     * It also demonstrates Data coupling: passing primitive type
     * 
     * @param tireNumber The number of the tire to check.
     * @param pressure The pressure of the tire in psi.
     */
    public static void checkTirePressure(int tireNumber, double pressure) {
        System.out.println("Checking pressure of tire " + tireNumber + ": " + pressure + " psi.");
    }

    /**
     * Prints the information of a vehicle.
     * <p>
     * It also demonstrates Stamp coupling: passing an object.
     * 
     * @param vehicle The {@link Vehicle}'s' instance to print information of.
     */
    public static void vehicleInfo(Vehicle vehicle) {
        System.out.println("Vehicle Info: " + vehicle.make + " " + vehicle.model);
    }
    
}
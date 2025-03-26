/**
 * A driver class.
 */
public class Driver {
    public static void main(String[] args) {
        Car toyotaCorollaCar = new Car(Make.Toyota, Toyota.Corolla);
        Truck fordF150Truck = new Truck(Make.Ford, Ford.F-150);

        // Polymorphism demonstration
        toyotaCorollaCar.start();
        fordF150Truck.start();

        // Polymorphism (method overloading)
        toyotaCorollaCar.drive(50);
        toyotaCorollaCar.drive("Ames");

        // Interface demonstration
        toyotaCorollaCar.refuel(20);

        VehicleService service = new VehicleService();

        // Data coupling demonstration
        service.checkTirePressure(2, 32.5);

        // Stamp coupling demonstration
        service.vehicleInfo(fordF150Truck);
    }
    
}

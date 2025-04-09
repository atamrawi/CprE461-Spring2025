/**
 * An interface for a logging system.
 */
public interface ILogger {

    /**
     * Logs a message.
     */
    public void log(String message);
}

/**
 * A simple console logger that implements the ILogger interface.
 */
public class ConsoleLogger implements ILogger {
    /**
     * Logs a message to the console.
     *
     * @param message The message to log
     */
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

/**
 * An interface for a database system.
 */
public interface IDatabase {
    /**
     * Saves an order to the database.
     *
     * @param order The order to save
     * @return true if the order was saved successfully, false otherwise
     */
    public boolean saveOrder(Order order);

}

/**
 * A simple SQL database implementation of the IDatabase interface.
 */
public class SqlDatabase implements IDatabase {

    /**
     * Saves an order to the SQL database.
     */
    public boolean saveOrder(Order order) {
        // Implementation omitted
        return true;
    }

}

/**
 * A simple class that represents an order service that uses the ILogger and IDatabase interfaces.
 */
public class OrderService {

    /**
     * Logger for order events.
     */
    private final ILogger logger;

    /**
     * Database for order storage.
     * This is a dependency that can be replaced with a mock or stub for testing.
     * This allows for better separation of concerns and easier testing.
     * The OrderService does not need to know the details of how the database works,
     * it just needs to know that it can save an order.
     */
    private final IDatabase database;

    /**
     * Constructor to initialize the OrderService with required services.
     * 
     * @param logger See {@link ILogger}
     * @param database See {@link IDatabase}
     */
    public OrderService(ILogger logger, IDatabase database) {
        this.logger = logger;
        this.database = database;
    }

    /**
     * Saves an order to the database.
     * 
     * @param order See {@link Order}
     * @throws IllegalArgumentException if the order is null
     */
    public void saveOrder(Order order) {
        if (database.saveOrder(order)) {
            logger.log("Order saved successfully: " + order.getId());
        } else {
            logger.log("Failed to save order: " + order.getId());
        }
    }
    
}
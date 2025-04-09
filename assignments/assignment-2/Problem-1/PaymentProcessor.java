
/**
 * A class that processes payments for an e-commerce application.
 * It handles user authentication, applies discounts, checks inventory,
 * calculates shipping, records sales, and logs transactions.
 * It uses various services to perform these tasks.
 */
public class PaymentProcessor {
    /**
     * Service for user authentication.
     */
    private AuthenticationService authService;

    /**
     * Service for applying discounts to orders.
     */
    private DiscountService discountService;

    /**
     * Service for checking inventory availability.
     */
    private InventoryService inventoryService;

    /**
     * Service for calculating shipping costs.
     */
    private ShippingService shippingService;

    /**
     * Service for recording sales analytics.
     */
    private AnalyticsService analyticsService;

    /**
     * Logger for transaction events.
     */
    private TransactionLogger logger;

    /**
     * Payment gateway for processing payments.
     */
    private PaymentGateway paymentGateway;

    /**
     * Constructor to initialize the PaymentProcessor with required services.
     * 
     * @param authService See {@link AuthenticationService}
     * @param discountService See {@link DiscountService}
     * @param inventoryService See {@link InventoryService}
     * @param shippingService See {@link ShippingService}
     * @param analyticsService See {@link AnalyticsService}
     * @param logger See {@link TransactionLogger}
     * @param paymentGateway See {@link PaymentGateway}
     */
    public PaymentProcessor(AuthenticationService authService,
                             DiscountService discountService,
                             InventoryService inventoryService,
                             ShippingService shippingService,
                             AnalyticsService analyticsService,
                             TransactionLogger logger,
                             PaymentGateway paymentGateway) {
        this.authService = authService;
        this.discountService = discountService;
        this.inventoryService = inventoryService;
        this.shippingService = shippingService;
        this.analyticsService = analyticsService;
        this.logger = logger;
        this.paymentGateway = paymentGateway;
    }

    /**
     * Processes a payment transaction for an order.
     * It checks if the user is authenticated, applies any discounts,
     * checks inventory availability, calculates shipping costs,
     * records the sale, and completes the payment.
     * 
     * @param order The order to be processed
     * @param discountCode The discount code to be applied
     * @param user The user making the order
     */
    public void processTransaction(Order order, int discountCode, User user) {
        if (!authService.isAuthenticated(user)) {
            logger.log("User not logged in. Cannot process payment.");
            return;
        }

        discountService.applyDiscount(order, discountCode);

        if (!inventoryService.checkInventory(order)) {
            logger.log("Insufficient inventory for order");
            return;
        }

        double shipping = shippingService.calculateShipping(order.getAddress(), order.getWeight());
        order.setShipping(shipping);

        analyticsService.recordSale(order);

        paymentGateway.completePayment(order);

        logger.log("Payment completed for order ID: " + order.getId());
    }
    
}
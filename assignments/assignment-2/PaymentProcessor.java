public class PaymentProcessor {
    public void processTransaction(
            Order order, 
            Database database, 
            int discountCode,
            Logger logger, 
            User currentUser) {

        // Step 1: Validate user's credentials
        if (!currentUser.isLoggedIn()) {
            logger.log("User not logged in. Cannot process payment.");
            return;
        }

        // Step 2: Apply discount logic
        if (discountCode > 0) {
            order.setDiscount(findDiscountPercent(discountCode));
        }

        // Step 3: Check inventory
        if (!checkInventory(database, order)) {
            logger.log("Insufficient inventory for order");
            return;
        }

        // Step 4: Calculate shipping cost
        double shippingCost = calculateShipping(order.getAddress(), order.getWeight());
        order.setShipping(shippingCost);

        // Step 5: Update internal analytics
        updateDailySalesStats(order, logger);

        // Step 6: Complete payment
        // (Implementation detail omitted)
        logger.log("Payment completed for order ID: " + order.getId());
    }

    private double findDiscountPercent(int code) { /* ... */ }
    private boolean checkInventory(Database db, Order order) { /* ... */ }
    private double calculateShipping(String address, double weight) { /* ... */ }
    private void updateDailySalesStats(Order order, Logger logger) { /* ... */ }
}
// Common Coupling: Using global variables (BAD PRACTICE)
class SharedData {
    public static String logMessage = "";
}

// Content Coupling: Directly modifying internal attributes of another class
class Database {
    private String data = "Sensitive Data";

    public String getData() {
        return data;  // ❌ Exposes internal state (BAD)
    }
}

// Stamp Coupling: Passing entire objects when only specific data is needed
class ReportGenerator {
    public void generateReport(Database db) {  // ❌ Passing full object (BAD)
        String reportData = db.getData();  // Content Coupling (BAD)
        System.out.println("Generating report with: " + reportData);
    }
}

// Control Coupling: Passing flags to modify behavior
class PaymentProcessor {
    public void processPayment(double amount, boolean useDiscount) { // ❌ Control Coupling
        if (useDiscount) {
            System.out.println("Processing discounted payment of $" + (amount * 0.9));
        } else {
            System.out.println("Processing full payment of $" + amount);
        }
    }
}

// Main class violating all types of bad coupling
class Main {
    public static void main(String[] args) {
        // Common Coupling (Global Variable Modification)
        SharedData.logMessage = "System Started";  

        Database db = new Database();
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(db); // Stamp + Content Coupling

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(100, true); // Control Coupling
    }
}

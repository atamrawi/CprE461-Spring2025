// FIX 1: Remove Common Coupling (No Global Variables)
class Logger {
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

// FIX 2: Encapsulate Database Internals
class Database {
    private String data = "Sensitive Data";

    public String fetchDataForReport() {  // ✅ Encapsulated access (Better)
        return "Processed: " + data; 
    }
}

// FIX 3: Pass Only Necessary Data (Avoids Stamp Coupling)
class ReportGenerator {
    public void generateReport(String reportData) {  // ✅ Pass only required data
        System.out.println("Generating report with: " + reportData);
    }
}

// FIX 4: Remove Control Coupling (No Boolean Flags)
class PaymentProcessor {
    public void processDiscountedPayment(double amount) {
        System.out.println("Processing discounted payment of $" + (amount * 0.9));
    }

    public void processFullPayment(double amount) {
        System.out.println("Processing full payment of $" + amount);
    }
}

// Main class with improved loose coupling
class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("System Started");  // ✅ No global variable

        Database db = new Database();
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(db.fetchDataForReport()); // ✅ No content or stamp coupling

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processFullPayment(100);  // ✅ No control coupling
    }
}

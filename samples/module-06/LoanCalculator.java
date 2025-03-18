public class LoanCalculator {
    
    public static void computePayments(int months, double interestRate) {
        final long MIN_LOAN_AMOUNT = 1000; // Example minimum loan amount
        final long MAX_LOAN_AMOUNT = 10000; // Example maximum loan amount

        for (long loanAmount = MIN_LOAN_AMOUNT; loanAmount < MAX_LOAN_AMOUNT; loanAmount++) {
            double payment = loanAmount / ((1.0 - Math.pow(1.0 + (interestRate / 12.0), -months)) / (interestRate / 12.0));

            System.out.printf("Loan Amount: %d, Monthly Payment: %.2f%n", loanAmount, payment);
        }
    }

    public static void main(String[] args) {
        int months = 60; // Example: 5-year loan
        double interestRate = 0.05; // Example: 5% annual interest rate

        computePayments(months, interestRate);
    }
}

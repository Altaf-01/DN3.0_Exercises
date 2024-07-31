public class RecursiveFutureValue {
    
    // Recursive method to calculate the future value
    public static double calculateFutureValue(double principal, double rate, int years) {
        // Base case: no more years to add
        if (years <= 0) {
            return principal;
        }
        // Recursive case: apply growth for one year and reduce the problem size
        return calculateFutureValue(principal * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double principal = 1000; // Initial investment amount
        double rate = 0.05;      // Annual growth rate (5%)
        int years = 10;          // Number of years

        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }
}

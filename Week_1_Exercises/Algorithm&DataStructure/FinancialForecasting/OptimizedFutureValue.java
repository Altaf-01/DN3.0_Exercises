import java.util.HashMap;
import java.util.Map;

public class OptimizedFutureValue {
    
    private static Map<Integer, Double> memo = new HashMap<>();
    
    public static double calculateFutureValue(double principal, double rate, int years) {
        // Base case
        if (years <= 0) {
            return principal;
        }
        
        // Check memoization
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        
        // Recursive case with memoization
        double result = calculateFutureValue(principal * (1 + rate), rate, years - 1);
        memo.put(years, result);
        return result;
    }

    public static void main(String[] args) {
        double principal = 1000; // Initial investment amount
        double rate = 0.05;      // Annual growth rate (5%)
        int years = 10;          // Number of years

        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }
}

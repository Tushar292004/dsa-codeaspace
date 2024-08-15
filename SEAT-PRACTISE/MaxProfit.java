import java.util.*;
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int n = prices.length - 1;
        int profit = 0;
        for (int i = 0; i < n ; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of days
        int n = scanner.nextInt();
        // Read the prices for each day
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        // Output the maximum profit
        System.out.println(maxProfit(prices));
    }
}

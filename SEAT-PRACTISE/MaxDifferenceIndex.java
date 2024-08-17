import java.util.*;

public class MaxDifferenceIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scan.nextInt();
        }

        int result = MaxDifference(n, heights);
        System.out.println(result);
    }

    public static int MaxDifference(int n, int[] heights) {
        if (n < 2) {
            return -1;
        }

        int minHeight = heights[0];
        int minIndex = 0;
        int maxDifference = Integer.MIN_VALUE;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int currrentDiff = height - minHeight;
            if (currrentDiff > maxDifference) {
                maxDifference = currrentDiff;
                endIndex = i;
            }

            if (height < minHeight) {
                minHeight = height;
                minIndex = i;
            }
        }
        return endIndex;
    }
}
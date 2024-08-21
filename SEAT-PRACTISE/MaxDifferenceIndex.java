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

    public static int MaxDifference(int n, int[] nums) {
        int diff = Integer.MIN_VALUE; // Use Integer.MIN_VALUE instead of -sys.maxsize
        
        if (nums.length == 0) {
            return diff; // Return if the list is empty
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i] && diff < (j - i)) {
                }
            }
        }
        return diff;
    }
}
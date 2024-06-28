package leetCode;

import java.util.Arrays;

public class limitReverse {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        reverse(nums, 2);
    }

    static void reverse(int[] nums, int k){
        if(k != 0){
            int[] right = new int[nums.length - k];
            int[] left = new int[k];
            for (int i = 0; i < nums.length - k; i++){
            right[i] = nums[i];
            }
            System.out.println(Arrays.toString(right));
            for(int j = 0; j < k; j++){
            left[j] = nums[j+k+1];
            }
            System.out.println(Arrays.toString(left));
            int count = 0;
            for (int n =0; n < k; n++){
                nums[count] = left[n];
                count++;
            }
            for(int m = 0; m < nums.length - k; m++){
                nums[count] = right[m];
                count++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}

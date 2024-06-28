package sorting;

import java.util.Arrays;
//Space Complexity : o(1) { No extra space required}
// Time Complexity : Worst and Best : o(N^2)
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,9,8,3,4,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = 0; i <= end; i++){
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

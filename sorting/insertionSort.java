package sorting;

import java.util.Arrays;
//Space Complexity : o(1) { No extra space required}
//Time Complexity : 
//Best Case - o(N) {Array is already sorted}
//Worst Case - o(N^2) {Array is sorted in opposite direction}
//Also know as Hybrid Sorting algorithm
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 9, 8, 3, 4, 5 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

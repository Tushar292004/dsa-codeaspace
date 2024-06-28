package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class allDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1 };
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                result.add(arr[j]);
            }
        }
        System.out.println(result);
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

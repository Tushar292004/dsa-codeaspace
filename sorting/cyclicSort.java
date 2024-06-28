package sorting;
import java.util.Arrays;
// Use cyclic sort when given numbers range from 1 to N
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 3 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

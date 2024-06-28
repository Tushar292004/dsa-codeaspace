// bubble sort is also known as Sinking sort & Exchange Sort4
//Space Complexity : o(1) { No extra space required}
//Time Complexity : 
//Best Case - o(N) {Array is already sorted}
//Worst Case - o(N^2) {Array is sorted in opposite direction}
package sorting;
import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        boolean swapped = false;
        for ( int i = 0; i < arr.length; i++){
            for( int j = 1; j < arr.length - i; j++){
                //comparing 
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }

    }
}


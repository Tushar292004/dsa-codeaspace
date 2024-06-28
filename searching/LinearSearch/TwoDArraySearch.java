package searching.LinearSearch;
import java.util.Arrays;
public class TwoDArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 9, 8, 7, 6, -11 },
                { 13, 12,200, 11, 10 },
                { 22, 25 }
        };

        int target = 10;
        int[] ans = search(arr, target);
        int[] max = max(arr);
        int[] min = min(arr);
        System.err.println("2D Array : " + Arrays.deepToString(arr));
        System.out.println("Index of Target Value : "+ Arrays.toString(ans));
        System.out.println("Index of Max Value : "+ Arrays.toString(max));
        System.err.println("Index of Min Value : " + Arrays.toString(min));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    // important part as returning an new array.
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] max(int[][] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int[] init : arr) {
            for (int i : init) {
                if (i > maxValue) {
                    maxValue = i ;
                }
            }
        }

        int[] maxValueIndex = search(arr, maxValue);
        return maxValueIndex;
    }

    static int[] min(int[][] arr) {
        int minValue = arr[0][0];
        for (int[] init : arr) {
            for (int i : init) {
                if (i < minValue) {
                    minValue = i ;
                }
            }
        }

        int[] minValueIndex = search(arr, minValue);
        return minValueIndex;
    }
}

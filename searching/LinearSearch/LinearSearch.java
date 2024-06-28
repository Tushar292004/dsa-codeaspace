package searching.LinearSearch;

public class LinearSearch{
    public static void main(String[] args) {
        int[] nums = { 23, 242, 5, 26, 27, 278, 34, 124, 645 };
        int target1 = 6453;
        int target2 = 27;
        int ans = linearSearchFuncEnhanced(nums, target1);
        int ans2 = linearSearchFunc(nums, target2);
        System.out.println(ans + " " + ans2);
    }

    // search in the array: return the "element" if found other then return constant
    static int linearSearchFuncEnhanced(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target is not found
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if found other then return -1
    static int linearSearchFunc(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is == target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target is not found
        return -1;
    }
}

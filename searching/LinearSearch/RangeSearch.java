package searching.LinearSearch;

public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {23,225,27,28,282,81,55};
        int target = 28;
        int ans = linearSearchFunc(arr, target, 2, 6);
        System.out.println(ans);
    }
    
    // search in the array: return the index if found other then return -1 with custom start-end range parameters 
    static int linearSearchFunc(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = start; i <= end; i++) {
            // check for element at every index if it is == target
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target is not found
        return -1;
    }
}

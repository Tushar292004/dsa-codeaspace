package searching.BinarySearch;

public class AgnosticBinary {
    public static void main(String[] args) {
        int[] arr = {29,27,26,19,17,15,11,5,2 };
        int target = 26;
        int index = orderAgnosticBinarySearch(arr, target);
        System.out.println("Index of " + target + " is " + index);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

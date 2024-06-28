package searching.BinarySearch;
class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7 };
        int target = 5;
        int ans = Ceil(arr, target);
        System.out.println(ans);
    }

    // return index
    static int Ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = start + ((end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                if( target < arr[end]){
                    return arr[end];
                }
                    return mid;
                }
            }
            return arr[start];
        }
       // similarly for floring return arr[end]
    }




package leetCode;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class StartEnd {
    public static void main(String[] args) {
        
    }

    public int[] searchRange(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = search(arr, target, true);

        int  end = search(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    int search(int[] arr, int target, boolean findStart){
        int ans = -1;
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
                ans = mid;
                if(findStart){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;  
    }
}
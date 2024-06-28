package leetCode;

import searching.BinarySearch.binarySearch;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
       int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
       System.err.println(findRange(arr, 10));
    }

    static int findRange(int[] arr, int target){
        //first find the range
        //first start with a box of size 2 
        int start = 0;
        int end = 1;

        //codition for the target to lie in the range 
        while (target > arr[end]){
            int newStart = end+1;
            //double box value
            //size of box = end - start + 1
            end = end + (end - start + 1)*2;
            start = newStart ;
            
        }
        return BinarySearch(arr, target, start, end );
    }

    // return index
    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
            int mid = start + ((end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

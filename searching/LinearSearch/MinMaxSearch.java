package searching.LinearSearch;

public class MinMaxSearch {
    public static void main(String[] args) {
       int[] arr = {12,13,14,15,16,17,45}; 
       System.out.println("Minimum : " + min(arr) + " Maximum : " + max(arr));
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++){
            if (min >= arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++){
            if (max <= arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

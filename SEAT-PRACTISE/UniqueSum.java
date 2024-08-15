import java.util.*;
public class UniqueSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int s = scan.nextInt();
        int[] arr2 = new int[s];
        for(int i = 0; i < n; i++){
            arr1[i] = scan.nextInt();
        }
        for(int i = 0; i < s; i++){
            arr2[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
           if( !contain(arr1[i], arr2)) {
            sum += arr1[i];
           }
        }
        for(int i = 0; i < s; i++){
            if( !contain(arr2[i], arr1)) {
             sum += arr2[i];
            }
         }
        System.out.println(sum);
    }

    public static boolean contain(int n, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }
}


import java.util.*;
public class MaxiumDiff {
    public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in); 
       int num = scan.nextInt();
       int[] arr = new int[num];
       for(int i = 0; i < num; i++){
            arr[i] = scan.nextInt();
       }

       Arrays.sort(arr);
       int sum = 0;
       for(int i = 1; i < num; i++){
         if(arr[i] > 0){
            sum += arr[i];
         }
       }

       System.out.println("Maximum Difference is: " + (sum - arr[0]));
    }


}

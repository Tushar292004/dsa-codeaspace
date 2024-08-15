import java.util.*;
public class SubArrSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = scan.nextInt();
        }
        for(int k = 0;  k < n; k++ ){
            int sum = 0;
            for(int j = k; j < n; j++){
                if(sum < s){
                    sum = sum+arr[j];
                }else if( sum == s){
                    System.out.println("Sum found at index "+ (k+1) +" to "+ ((j-1)+1));
                    return;
                }
            }
        }
        System.out.println("-1 -1");
    }
}

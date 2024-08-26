import java.util.*;
public class EggDropping {

    public static int eggDrop(int n, int  k){
        //dynamic programming bottom up approach : tabulation method
        int[][] dp = new int[n+1][k+1];
        for(int e = 1; e <= n; e++){
            for(int f = 1; f <= k; f++){
                //base case 1 : for no.of eggs = 1
                if(e == 1){
                    dp[e][f] = f; 
                }
                //base case 2 : for no.of floor = 1
                else if(f == 1){
                    dp[e][f] = 1; 
                }
                // main logic for n eggs and k floors
                else{
                    int pRow = 0;
                    int min = Integer.MAX_VALUE;
                    for(int nRow = f - 1;  nRow >= 0; nRow--){
                        int v1 = dp[e][nRow];
                        int v2 = dp[e-1][pRow];
                        int val = Math.max(v1, v2);
                        min = Math.min(val, min);
                        pRow++;
                    }
                    //adding vlaue int dp table
                    dp[e][f] = min +1;
                }
            }
        }
        //returning the value at nth row and kth column as answer
        return dp[n][k] ;
    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(eggDrop(n, k));
    }
}

package leetCode;

import java.util.ArrayList;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class TwoDArray {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3,4}, {3,2,1}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        //person = row , account = col
        for (int person = 0; person < accounts.length; person++) {
            // new column take a new sum
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}

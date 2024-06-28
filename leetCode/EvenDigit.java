package leetCode ;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.*;
public class EvenDigit { 
    public static void main(String[] args) {
        int[]  nums = {12,345,2,6,7896} ;
        System.out.println(findNumber(nums));
    }
    
    static int findNumber(int[] nums){
        int count = 0;
        for( int num : nums) {
            if(even(num)){
                count ++;
            }
        }
        return count;
    }


    //check even digits or not
    static boolean even(int nums){
        int numOfDigits = digit(nums);
        return numOfDigits % 2 == 0;
    }

    //count no of digit in a number
    static int digit(int num){
        if (num < 0){
            num *= -1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count ++;
            num = num / 10;
        }
        return count;
    }
}
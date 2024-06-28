package leetCode;

import java.util.Arrays;

public class RC_Increment {
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(2, 3, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] newArr = new int[m][n];
        System.out.println(Arrays.deepToString(newArr));
        for(int i = 0; i < indices.length; i++){
                int row  = indices[i][0];
                int col = indices[i][1];
                System.out.println(row+" "+col);
                for(int p = 0; p < m; p++){
                    newArr[p][col]++;
                }
                for(int k = 0; k < n; k++){
                    newArr[row][k]++;
                }
        }

        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if( newArr[i][j]%2 != 0){
                    count++;
                }
            }
        }

        return count;
    }
}

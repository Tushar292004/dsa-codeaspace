package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixZer {
    public static void main(String[] args) {
        int[][] matrix = { { 0,1,2,0},{3,4,5,2} ,{1,3,1,5} };
        System.out.println(Arrays.deepToString(matrix));
        setZeroes(matrix);
    }

    static void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>(10);
        int rowCount = 0;
        System.out.println(row);
        ArrayList<Integer> col = new ArrayList<>(10);
        int colCount = 0;
        System.out.println(col);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i); rowCount++;
                    System.out.println(row);
                    col.add(j); colCount++;
                    System.out.println(col);
                }
            }
        }
        for(int j = 0; j < rowCount; j++){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[row.get(j)][i] = 0;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < colCount; j++){
                matrix[i][col.get(j)] = 0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}

package searching.BinarySearch;
import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = { 
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int target = 6;
        System.out.println(Arrays.toString(binarySearch(matrix, target)));
    }

    static int[] simpleBinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;
            if( matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            else if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
                }
        }
        return new int[]{-1, -1};
    }

    static int[] binarySearch(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return simpleBinarySearch(matrix, 0, 0, cols-1, target);
        } 

        int rStart = 0;
        int rEnds = rows - 1;
        int cMid = cols/2;
        while (rStart < (rEnds-1)) {
            int mid = rStart + (rEnds - rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            else if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnds = mid;
                }
        }   

        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        //search in 1 half
        if (target <= matrix[rStart][cMid-1] ) {
            return simpleBinarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //search in 2 half
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols - 1] ) {
            return simpleBinarySearch(matrix, rStart, cMid + 1, cols -1, target);
        }
        //search in 3 half
        if (target <= matrix[rStart + 1][cMid-1]) {
            return simpleBinarySearch(matrix, rStart+1, 0,  cMid-1, target);
        }
        //search in 4 half
        else{
            return simpleBinarySearch(matrix, rStart+1, cMid + 1, cols -1, target);
        }
    }
}

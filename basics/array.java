package basics;
import java.util.*;
public class array {
    public static void main(String[] args) {

        // Array of primitives
        int[] arrayExample = { 10, 11, 12, 13, 14, 15 };
        int[] arrayExample2 = new int[5];
        Scanner in = new Scanner(System.in); // input reader

        // get values in arrayExample2
        for (int i = 0; i <= arrayExample2.length - 1; i++) {
            arrayExample2[i] = in.nextInt(); // reads and stores the value
        }

        System.out.print("\n" + "Array 2 :");
        // printing the value of arrayExample2
        for (int i = 0; i <= arrayExample2.length - 1; i++) {
            System.out.print(arrayExample2[i] + " ");
        }

        System.out.print("\n" + "Array 1 :");
        // printing the value for arrayExample with enhanced for loop
        for (int num : arrayExample) {
            System.out.print(num + " ");
        }

        System.out.print("\n");
        // Another way of printing by using Arrays method
        System.out.println("Array 2 :" + Arrays.toString(arrayExample2));

        // Array of non primitives
        String[] strExample = new String[5];
        for (int i = 0; i < strExample.length; i++) {
            strExample[i] = in.next();
        }
        System.err.println("String Array : " + Arrays.toString(strExample));
        // modifying
        strExample[4] = "Strings";
        System.err.println("String Array Modified: " + Arrays.toString(strExample));

        // Multi Dimensional Arrays
        int[][] arrTwoD = {
                { 1, 2, 3 },
                { 4, 5 },
                { 7, 8, 9 }
        };
        System.out.println("2D Array : " + Arrays.deepToString(arrTwoD));
        int[][] arrTwoD2 = new int[3][4];
        // input
        for (int row = 0; row < arrTwoD2.length; row++) {
            for (int col = 0; col < arrTwoD2[row].length; col++) {
                arrTwoD2[row][col] = in.nextInt();
            }
        }
        //enhanced for loop 2d array
        for (int[] num: arrTwoD2) {
            System.out.println(Arrays.toString(num));
        }
    }
}
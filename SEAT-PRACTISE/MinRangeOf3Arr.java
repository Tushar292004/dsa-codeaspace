import java.util.*;
public class MinRangeOf3Arr {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int size1 = scan.nextInt();
        int[] arr1 =  new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        
        int size2 = scan.nextInt();
        int[] arr2 =  new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

        int size3 = scan.nextInt();
        int[] arr3 =  new int[size3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr3));

        //finding the range
         int diff = Integer.MAX_VALUE;
         int minRangeStart = 0, minRangeEnd = 0;
         int i = 0, j = 0, k = 0;
 
         // Loop to find the smallest range
         while (i < size1 && j < size2 && k < size3) {
             int minimum = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
             int maximum = Math.max(arr1[i], Math.max(arr2[j], arr3[k]));
 
             if (maximum - minimum < diff) {
                 diff = maximum - minimum;
                 minRangeStart = minimum;
                 minRangeEnd = maximum;
             }
 
             // Move the pointer that points to the smallest value
             if (arr1[i] == minimum) i++;
             else if (arr2[j] == minimum) j++;
             else k++;
         }

         System.out.println("(" + minRangeStart + ", " + minRangeEnd + ")");
     }

}
import java.util.*;
public class MeadianOfTwoSortedArr {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int size1 = scan.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        int size2 = scan.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        //merging array
        int mainArrSize = size1+size2;
        int[] mainArr = new int[mainArrSize];
        for (int i = 0; i < mainArr.length; i++) {
            if(i<size1){
                mainArr[i]=arr1[i];
            }
            else{
                mainArr[i]=arr2[i-size1];
            }
        }
        System.out.println(Arrays.toString(mainArr));

        //finding median
        if( mainArrSize%2 != 0 ){
           double ans = mainArr[mainArrSize/2 - 1];
           System.out.println(ans);
        }else{
            double ans =  mainArr[mainArrSize/2 - 1] + mainArr[((mainArrSize/2)+1) - 1];
            System.out.println(ans/2.0);
        }
    }
}

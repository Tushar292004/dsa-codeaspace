package leetCode;
import java.util.Arrays;
public class ShuffleArray {
        public static void main(String[] args) {
            int[] nums = {1,2,3,4,5,6};
            int n = 3;
            int[] res = shuffle(nums, n);
            System.out.println(Arrays.toString(res) );
        }

        static int[] shuffle(int[] nums, int n){
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int midValue = nums.length/2;
            int pos = 0;
    
            for (int i = 0; i < midValue; i++){
                arr1[i] = nums[pos];
                pos++;
            }
            System.out.println(Arrays.toString(arr1));
    
            for (int i = 0; i < midValue; i++){
                arr2[i] = nums[pos];
                pos++;
            }
            System.out.println(Arrays.toString(arr2));

            int[] mainArr = new int[nums.length];
            int pos1 = 0;
            int pos2 = 0;
            for (int i = 0; i < nums.length; i++){
                if(i%2 == 0){
                    mainArr[i] = arr1[i];
                    pos1++;
                }else{
                    mainArr[i] = arr2[i-1];
                    pos2++;
                }
            }
            return mainArr;
        }
}

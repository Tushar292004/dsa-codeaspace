import java.util.*;
public class ListDuplicateRemove {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int s = scan.nextInt();
            int[] arr = new int[s];
            for (int j = 0; j < s; j++) {
                arr[j] = scan.nextInt();
            }
            removeDuplicates(arr);
        }
    }

    public static void removeDuplicates(int[] arr){
        ArrayList<Integer> ans =  new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!ans.contains(arr[i])) {
                ans.add(arr[i]);
            }
        }
       for (int n : ans){
        System.out.print(n + " ");
       }
    }
}

import java.util.*;
public class MakeArrEmpty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(OperationCount(arr));

    }
    public static long OperationCount(int[] A) {
        int n = A.length;
        Integer[] pos = new Integer[n];
        for (int i = 0; i < n; ++i)
            pos[i] = i;
        Arrays.sort(pos, (i, j) -> A[i] - A[j]);
        long res = n;
        for (int i = 1; i < n; ++i)
            if (pos[i] < pos[i - 1])
                res += n - i;
        return res;
    }
}

import java.util.*;

public class UniqueDigitNumbers {

    static boolean hasUniqueDigits(int num) {
        //hasset doesnt have duplicates
        Set<Integer> digits = new HashSet<>();
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            if (!digits.add(digit)) {
                return false;
            }
        }
        return true;
    }

    static void printUnique(int l, int r) {
        for (int i = l; i <= r; i++) {
            if (hasUniqueDigits(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start  = scan.nextInt();
        int end  = scan.nextInt();
        printUnique(start, end);
    }
}
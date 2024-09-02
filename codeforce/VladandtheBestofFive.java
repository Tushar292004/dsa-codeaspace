
import java.util.*;
public class VladandtheBestofFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n   = scan.nextInt();
        while (n-- > 0) {
            int countA = 0;
            int countB = 0;
            String str = scan.next();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A') {
                    countA++;
                }else{
                    countB++;
                }
            }
            System.out.println(countA > countB ? 'A' : 'B');
        }
    }
}


//Knuth Morris Pratt Algorithm
import java.util.*;

public class KMP {
    void KMPSearch(String pattern, String string) {
        int lp = pattern.length();
        int ls = string.length();
        int[] table = new int[lp];
        int j = 0;
        prefixtable(pattern, lp, table);
        int i = 0;
        while (i < ls) {
            if (pattern.charAt(j) == string.charAt(i)) {
                j++;
                i++;
            }
            if (j == lp) {
                System.out.println("Found at index " + (i - j));
                j = table[j - 1];
            } else if (i < ls && pattern.charAt(j) != string.charAt(i)) {
                if (j != 0) {
                    j = table[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
    }

    void prefixtable(String pattern, int M, int table[]) {
        int j = 0;
        int i = 1;
        table[0] = 0;
        while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                table[i] = j;
                i++;
            }
            else{
                if(j != 0){
                    j = table[j - 1];
                }else{
                    table[i] = j;
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String pattern = scan.nextLine();
        KMP kmp = new KMP();
        kmp.KMPSearch(pattern, string);
    }
}
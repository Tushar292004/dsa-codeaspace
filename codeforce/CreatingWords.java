package codeforce;
import java.util.*;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        while (n-- > 0) {
            String str = scan.nextLine();
            String[] e = str.split(" ");
            
            
            char firstCharStr1 = e[0].charAt(0);
            char firstCharStr2 = e[1].charAt(0);
            
            String newStr1 = firstCharStr2 + e[0].substring(1);
            String newStr2 = firstCharStr1 + e[1].substring(1);
            
            System.out.println(newStr1 + " " + newStr2);
        }
    }
}

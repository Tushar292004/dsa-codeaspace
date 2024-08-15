// Knuth Morris Pratt Algorithm x
// This is the bruteforce algorithm 
import java.util.*;
public class PatternMatching {
    public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in);
       StringBuilder text = new StringBuilder();
       System.out.println("Enter the text: ");
       text.append(scan.nextLine());
       System.out.println("Enter the pattern: ");
       String pattern = scan.nextLine();
        
       ArrayList ans = new ArrayList<>();

       int pointerStart = 0;
       int pointerEnd = pattern.length();
       int end =  text.length();
       while(pointerEnd <= end){
        String temp = text.substring(pointerStart,pointerEnd);
        if ( temp.equals(pattern)) {
            System.out.println(pointerStart+1 + " "+ (pointerEnd));
            pointerStart++;
            pointerEnd++;
        }else{
            pointerStart++;
            pointerEnd++;
        }
       }
    }
}
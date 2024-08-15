import java.util.*;
public class NoOcurrence {
    public static int count(int n, int digit){
        int count = 0;
        while( n > 0){
            int lastDigit = n % 10;
            if(lastDigit == digit){
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int digit = scan.nextInt();
        int Finalcount = 0;
        
        for (int i = start; i <= end; i++) {
            Finalcount += count(i, digit);
        }
        System.out.println(Finalcount);
    }
}

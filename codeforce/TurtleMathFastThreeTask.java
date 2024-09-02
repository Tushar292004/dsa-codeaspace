import java.util.Scanner;  

public class TurtleMathFastThreeTask {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int t = scanner.nextInt(); 

        while (t-- > 0) {  
            int k = scanner.nextInt();
            int sum = 0;  
            boolean hv = false;

            for (int i = 0; i < k; i++) {  
                int x = scanner.nextInt(); 
                sum += x; 
                if (x % 3 == 1) {  
                    hv = true;
                }  
            }  

            
            if (sum % 3 == 0) {  
                System.out.println(0);  
            } else if (sum % 3 == 2) {  
                System.out.println(1);  
            } else {  
                if (hv) {  
                    System.out.println(1);  
                } else {  
                    System.out.println(2);  
                }  
            }  
        }  

    }  
}
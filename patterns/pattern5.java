package patterns;

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < (n * 2); i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k < n; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
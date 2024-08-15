import java.util.Scanner;

public class ExcelColTiltle {
    public static String convertToTitle(int colNum) {
        StringBuilder output = new StringBuilder();
        while(colNum > 0){
            colNum--;
            char c = (char) (colNum % 26 + 'A');
            colNum /= 26;
            output.append(c);
        }
        output.reverse();
        return output.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input  = scan.nextInt();
        String ans = convertToTitle(input);
        System.out.println(ans);
    }
}

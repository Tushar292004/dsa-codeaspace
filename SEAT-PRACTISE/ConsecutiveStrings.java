import java.util.*;
public class ConsecutiveStrings {
    public static void main(String[] args) {
        Scanner scan  =  new Scanner(System.in);
        String  input =  scan.nextLine();
        String ans = "";
        for(int i = 0; i < input.length(); i++){
            char temp = input.charAt(i);
            if( !ans.contains(Character.toString(temp))){
                ans += temp;
            }
        }
        System.out.println(ans);
    }
}

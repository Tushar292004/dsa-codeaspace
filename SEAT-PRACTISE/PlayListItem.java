import java.util.*;
public class PlayListItem {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        while (true) {
            String ch = scan.next();
            if( !ch.equals("-")){
                input.add(ch);
            }else{
                break;
            }
        }
        System.out.print("Forward Playlist: ");
        for (int i = 0; i < input.size() ; i++) {
            
            System.out.print( input.get(i)+ " ");
        }
        System.out.println();
        System.out.print("Backward Playlist: ");
        for (int i = input.size()-1; i >= 0; i--){
            
            System.out.print(input.get(i)+ " ");
        }
    }
}

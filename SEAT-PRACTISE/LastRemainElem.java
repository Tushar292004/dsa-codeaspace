import java.util.*;

public class LastRemainElem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        // Initialize the list of numbers from 1 to n
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numberList.add(i);
        }

        int roundCount = 1;  // Start with the first round

        // Continue removing elements until only one remains
        while (numberList.size() > 1) {
            if (roundCount % 2 == 1) {
                // Left to right removal (odd rounds)
                for (int i = 0; i < numberList.size(); i++) {
                    numberList.remove(i);
                }
            } else {
                // Right to left removal (even rounds)
                int j = numberList.size() - 1;
                while(j >= 0){
                    numberList.remove(j);
                    j -= 2;
                }
            }
            roundCount++; 
        }
        System.out.println(numberList.get(0));
    }
}

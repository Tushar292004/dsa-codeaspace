import java.util.*;

public class StackOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    stack.push(scan.nextInt());
                    System.out.println("Node is Inserted");
                    break;
                case 2:
                    System.out.println("Popped Element: " + stack.peek());
                    stack.pop();
                    break;
                case 3:
                    if (stack.empty()) {
                        System.out.println("EMPTY STACK");
                    } else {
                        Object[] arr = stack.toArray();
                        System.out.print("The Stack is: ");
                        for (int j = 0; j < arr.length; j++)
                            System.out.print(arr[j]+" ");
                    }
                    break;
                case 4:
                    return;

                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}

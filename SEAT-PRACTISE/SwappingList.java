import java.util.*;
class ListNode{
    int val;
    ListNode next;
    
    //constructor
    ListNode (int x){
        val = x; }
}

public class SwappingList{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ListNode head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            ListNode newNode = new ListNode(value);
            if ( head == null) {
                head = newNode;
                tail = head;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        int k = scan.nextInt();
        head = reverseKgroup(head, k);
        printList(head);
    }

    public static ListNode reverseKgroup(ListNode head, int k){
        ListNode curr = head;
        int count = 0;
        while (curr != null && count != k) {
                curr = curr.next;
                count++;
        }

        if(count == k){
            curr = reverseKgroup(curr, k);
            while (count-- > 0) {
                ListNode tmp = head.next;
                head.next = curr;
                curr = head;
                head = tmp;
            }
            head = curr;
        }
        return head;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}
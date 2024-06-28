package linkedList;

public class CircularLinkedList {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(43);
        list.insert(33);
        list.insert(23);
        list.insert(13);
        list.insert(3);
        list.delete(43);
        list.display();
    }

}

class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    //insertion at first/head
    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //helper funciton
    public Node find(int val){
        Node temp =  head;
        while(temp.next != head){
          if(temp.next.value == val){
            return temp;
          }
          temp = temp.next;
        }
        return null;
      }

    //delete a particular node
    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
        }

        do{
            Node n = node.next;
            if (n.value == value) {
                node.next  = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    //display the circular linked list
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.err.print("HEAD");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }
}
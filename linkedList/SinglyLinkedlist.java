package linkedList;

public class SinglyLinkedlist {
    // Structure of linked list
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public SinglyLinkedlist() {
        this.size = 0;
    }

    // insert at first (head)
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // insert at last (tail)
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert at particular index
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // delete at head
    public void deleteFirst() {
        if (head == null) {
            tail = null;
        }
        head = head.next;
        size--;
    }

    // delete at last
    public void deleteLast() {
        if (head == null) {
            tail = null;
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
    }

    // deleting at particular index
    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
        Node temp = get(index - 1);
        temp.next = temp.next.next;
    }

    // deleting helper function
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // search the value node
    public int search(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node.value;
            }
            node = node.next;
        }
        return node.value;
    }

    // function to display nodes
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // structure of a node
    private class Node {
        private int value;
        private Node next; // creates an next node

        // constructor
        public Node(int value) {
            this.value = value;
        }

        // constructor
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

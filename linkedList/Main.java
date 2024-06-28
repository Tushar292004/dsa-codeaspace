package linkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedlist list = new SinglyLinkedlist();
        list.insertFirst(3);
        list.insertFirst(17);
        list.insertFirst(8); // will not show
        list.insertLast(23);
        list.insertLast(33); // will not show
        list.insert(43, 3);
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        list.display();
        System.out.println(list.search(23));;

    }
}

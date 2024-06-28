package linkedList;

public class DoublyLinkedList {
    public static void main (String[] args) {
        DDL list = new DDL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(0);
        list.insert(0, -1);
        list.insert(-1, -2);
        list.insert(-2, -3);
        list.deleteFirst(); // 5 will be removed 
        list.deleteLast(); // -3 will be removed
        list.delete(0); 
        list.display();
        list.displayRev();
      }
}

class DDL {
    Node head;
    int size;
    
    // node structure
    private class Node{
     
     int value;
     Node next;
     Node prev;
     
     private Node(int value){
       this.value = value;
     }
     
     private Node(int value, Node next, Node prev){
       this.value = value;
       this.next = next;
       this.prev = prev;
     }
     
   }
   
    // insert at head 
    public void insertFirst(int val){
      Node node = new Node(val);
      node.next = head;
      node.prev =  null;
      if(head != null){
        head.prev = node;
      }
      head = node;
      size++;
    }

    // insert at tail
    public void insertLast(int val){
      Node node  = new Node(val);
      Node last = head;
      node.next = null;
      
      if( head == null) {
        node.prev = null;
        head = node;
        return ;
      }
      
      while(last.next != null){
        last = last.next;
      }
      
      last.next = node;
      node.prev = last;
      size++;
    }
    
    // helper function
    public Node find(int val){
      Node temp =  head;
      while(temp != null){
        if(temp.value == val){
          return temp;
        }
        temp = temp.next;
      }
      return null;
    }
    
    // insert at after particular node
    public void insert(int after, int val){
      Node p = find(after);
      
      if( p == null){
        System.out.println("Node does not exist");
        return;
      }
      
      Node node = new Node(val);
      node.next = p.next;
      p.next = node;
      node.prev = p;
      if( node.next != null){
        node.next.prev = node;
      }
      
      size++;
    }
    
    // delete at head
    public void deleteFirst(){
      if(head.next != null){
        head.next.prev = null;
        head = head.next;
        return;
      }
      head.next = null;
      head.prev = null;
      size--;
    }
    
    //deletion at tail
    public void deleteLast(){
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.prev.next = null;
      temp.prev = null;
      size--;
    }
    
    //delete a specify element
    public  void delete(int val){
      Node p = find(val);
      if( p == null){
        System.out.println("Node does not exist");
        return;
      }
      
      p.prev.next = p.next;
      p.next.prev = p.prev;
      p.next = null;
      p.prev = null;
    }    
    
    // Displaying the List
    public void display(){
      System.out.println("Length of the list is : "+size);
      Node node  = head;
      while(node != null){
        System.out.print( node.value + " -> ");
        node = node.next ; 
      }
      System.out.print("END");
      System.out.println(" ");
    }
    
    // Display the list in reverse order 
    public void displayRev(){
      System.out.println("Reversed List");
      Node last = head;
      while(last.next != null){
        last = last.next;
      }
      while(last != null){
        System.out.print( last.value + " -> ");
        last = last.prev;
      }
      System.out.print("END");
    }
}


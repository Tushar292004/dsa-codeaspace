
package tree;
import java.util.*;
class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }

}
public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int key){
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if( key < root.key){
            root.left =  insertRec(root.left, key);
        }
        else if ( key > root.key){
            root.right = insertRec(root.right, key);
        }

        return root;
    }


    //tree travesal 
    void inorderTraversal(){
        inorder(root);
    }

    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    void preorderTraversal(){
        preorder(root);
    }

    void preorder(Node root){
        if(root != null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorderTraversal(){
        postorder(root);
    }

    void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    

    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();
       
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorderTraversal();

        System.out.println("\nPreorder traversal:");
        tree.preorderTraversal();

        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal();
    }
    }


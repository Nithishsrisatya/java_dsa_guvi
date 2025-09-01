import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int value){
        this.data = value;
        left = right = null;
    }
}
public class BinaryTree{
    Node root;
    Scanner obj = new Scanner(System.in);
    public Node buildTree(){
        System.out.println("Enter value (-1 for no Nodde) :");
        int val = obj.nextInt();
        if(val == -1)return null;
        Node newNode = new Node(val);
        System.out.println("Enter Left Child:" + val);
        newNode.left = buildTree();
        System.out.println("Enter Right Child:" + val);
        newNode.right = buildTree();
        return newNode;
    }
    public void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public void preorder(Node root){
        if(root == null)return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postOrder(Node root){
        if(root == null)return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = tree.buildTree();
        System.out.println("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println("\nPre-Order Traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPost-Order Traversal:");
        tree.postOrder(tree.root);
    }
}
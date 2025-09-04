import java.util.*;
public class BSTTree {
    Node root;
    static Scanner obj = new Scanner(System.in);
    public Node buildTree(){
        System.out.println("Enter value (-1 for no Node): ");
        while(true){
            int val = obj.nextInt();
            if(val == -1) break;
            root = insert(root,val);
        }
        return root;
    }
    public Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.data){
            root.left = insert(root.left,val);
        }
        else if(val > root.data){
            root.right = insert(root.right,val);
        }
        return root;
    }
    public void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public boolean search(Node root, int key){
        if(root == null)return false;
        if(root.data == key)return true;
        if(root.data > key) return search(root.left,key);
        else return search(root.right,key);
    }
    public Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public Node delete(Node root, int key){
        if(root == null)return null;
        if(key < root.data){
            root.left = delete(root.left,key);
        }
        else if(key > root.data){
            root.right = delete(root.right,key);
        }
        else{
            if(root.left == null && root.right == null)return null;
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }
    public static void main(String[] args){
        BSTTree tree = new BSTTree();
        tree.root = tree.buildTree();
        while(true){
            System.out.println("\n1. Inorder Traversal \t 2. Search Key \t 3. Delete Key \t 4. Exit");
            int ch = obj.nextInt();
            switch(ch){
                case 1: 
                    tree.inorder(tree.root);
                    break;
                case 2:
                    System.out.println("Enter key to search: ");
                    int key = obj.nextInt();
                     boolean found = tree.search(tree.root,key);
                     if(found){
                        System.out.println("Key " + key + " found ✔️");
                     }
                     else{
                        System.out.println("Key " + key + " not found ❌");
                     }
                    break;
                case 3:
                    System.out.println("Enter the key to delete: ");
                    int val = obj.nextInt();
                    tree.root = tree.delete(tree.root,val);
                    System.out.println("Key " + val + " deleted");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice\n");
            }
        }
    }
}
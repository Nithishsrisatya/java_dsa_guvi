import java.util.*;
public class HeightBST {
    Node root;
    static Scanner obj = new Scanner(System.in);
    public Node builtTree(){
        System.out.println("Enter values (-1 for no Nodes): ");
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
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public int height(Node root){
        if(root == null)return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public int countNodes(Node root){
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public int countLeaf(Node root){
        if(root == null)return 0;
        if(root.left == null && root.right == null)return 1;
        return countLeaf(root.left) + countLeaf(root.right);
    }
    public int countInternal(Node root){
        if(root == null || ( root.left == null && root.right == null))return 0;
        return 1 + countInternal(root.left) + countInternal(root.right);
    }
    public boolean isValid(Node root,int min, int max){
        if(root == null)return true;
        if(root.data <= min || root.data >= max) return false;
        return isValid(root.left, min, root.data) && 
               isValid(root.right, root.data, max);
    }
    public static void main(String[] args){
        HeightBST tree = new HeightBST();
        tree.root = tree.builtTree();
        System.out.println("Height of the Tree : " + tree.height(tree.root));
        System.out.println("Count No.of Nodes : " + tree.countNodes(tree.root));
        System.out.println("Count Leaf Nodes : " + tree.countLeaf(tree.root));
        System.out.println("Count Internal Node : " + tree.countInternal(tree.root));
        boolean valid = tree.isValid(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(!valid){
            System.out.println("Tree is not a valid BST");
        }
        else{
            System.out.println("Tree is a valid BST");
        }
    }
}

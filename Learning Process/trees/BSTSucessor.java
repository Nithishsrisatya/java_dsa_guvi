import java.util.*;
public class BSTSucessor {
    Node root;
    static Scanner obj = new Scanner(System.in);
    public Node builtTree(){
        System.out.println("Enter Values (-1 for no nodes): ");
        while(true){
            int val = obj.nextInt();
            if(val == -1)break;
            root = insert(root,val);
        }
        return root;
    }
    public Node insert(Node root,int val){
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
    public Node findmin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public Node inorderSucessor(Node root, Node target){
        if(target.right != null){
            return findmin(target.right);
        }
        Node sucessor = null;
        while(root != null){
            if(target.data < root.data){
                sucessor = root;
                root = root.left;
            }
            else if(target.data > root.data){
                root = root.right;
            }
            else break;
        }
        return sucessor;
    }
    public Node findMax(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
    public Node inorderPredecessor(Node root, Node target){
        if(target.left != null){
            return findMax(target.left);
        }
        Node predecessor = null;
        while(root != null){
            if(target.data > root.data){
                predecessor = root;
                root = root.right;
            }
            else if(target.data < root.data){
                root = root.left;
            }
            else{
                break;
            }
        }
        return predecessor;
    }
    public static void main(String[] args){
        BSTSucessor tree = new BSTSucessor();
        tree.root = tree.builtTree();
        Node target = tree.root.left.right;
        Node sucessor = tree.inorderSucessor(tree.root,target);
        if(sucessor != null){
            System.out.println("Sucessor of " + target.data + " is " + sucessor.data);
        }
        else{
            System.out.println("No sucessor found");
        }
        Node predecessor = tree.inorderPredecessor(tree.root,target);
        if(predecessor != null){
            System.out.println("Predecessor of " + target.data + " is " + predecessor.data);
        }
        else{
            System.out.println("No predecessor found");
        }
    }
}

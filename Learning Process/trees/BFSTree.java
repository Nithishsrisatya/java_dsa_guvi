import java.util.*;
public class BFSTree {
    Node root;
    Scanner obj = new Scanner(System.in);
    public void buildTree(){
        System.out.println("Enter root value: ");
        int val = obj.nextInt();
        if(val == -1)return;
        root = new Node(val);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println("Enter Left child of " + current.data + " (-1 for no child): ");
            int leftVal = obj.nextInt();
            if(leftVal != -1){
                current.left = new Node(leftVal);
                queue.add(current.left);
            }
            System.out.println("Enter Right child of " + current.data + " (-1 for no child): ");
            int rightVal = obj.nextInt();
            if(rightVal != -1){
                current.right = new Node(rightVal);
                queue.add(current.right);
            }
        }
    }
    public void bfsTraversal(Node root){
        if(root == null)return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if(current.left != null)queue.add(current.left);
            if(current.right != null)queue.add(current.right);
        }
    }
    public static void main(String[] args){
        BFSTree tree = new BFSTree();
        tree.buildTree();
        tree.bfsTraversal(tree.root);
    }
}

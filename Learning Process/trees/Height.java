import java.util.*;
public class Height {
    Node root;
    Scanner obj = new Scanner(System.in);
    public Node buildTree(){
        System.out.println("Enter value(-1 for null)");
        int val = obj.nextInt();
        if(val == -1) return null;
        Node newNode = new Node(val);
        System.out.println("Enter Left Child of " + val);
        newNode.left = buildTree();
        System.out.println("Enter Right Child of " + val);
        newNode.right = buildTree();
        return newNode;
    }
    public int height(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }
    public static void main(String[] args) {
        Height tree = new Height();
        tree.root = tree.buildTree();
        System.out.println("Height of tree is " + tree.height(tree.root));
    }
}

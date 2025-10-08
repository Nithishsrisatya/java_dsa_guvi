import java.util.*;
public class LCA {
    Node root;
    static Scanner obj = new Scanner(System.in);
    public Node builtTree(){
        System.out.println("Enter nodes (-1 for no Nodes): ");
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
            root.right = insert(root.right, val);
        }
        return root;
    }
    public Node findLCA(Node root, int n1, int n2){
        if(root == null)return null;
        if(root.data > n1 && root.data > n2){
            return findLCA(root.left,n1,n2);
        }
        if(root.data < n1 && root.data < n2){
            return findLCA(root.right,n1,n2);
        }
        return root;
    }
    public static void main(String[] args){
        LCA tree = new LCA();
        tree.root = tree.builtTree();
        System.out.println("Enter n1 and n2 nodes:");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        Node lca = tree.findLCA(tree.root, n1,n2);
        if(lca != null){
            System.out.println("LCA of " + n1 + "  and " + n2 +" is :" + lca.data);
        }
        else{
            System.out.println("No LCA found");
        }
    }
}

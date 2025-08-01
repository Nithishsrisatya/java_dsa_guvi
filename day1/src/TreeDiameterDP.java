import java.util.*;

public class TreeDiameterDP {
    static List<List<Integer>> tree;
    static int diameter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) tree.add(new ArrayList<>());
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        dfs(1, -1);
        System.out.println(diameter);
        sc.close();
    }

    // Returns the depth of the subtree rooted at node
    static int dfs(int node, int parent) {
        int max1 = 0, max2 = 0;
        for (int child : tree.get(node)) {
            if (child == parent) continue;
            int d = dfs(child, node) + 1;
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2) {
                max2 = d;
            }
        }
        diameter = Math.max(diameter, max1 + max2);
        return max1;
    }
}

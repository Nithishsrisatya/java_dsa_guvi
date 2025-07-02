import java.util.*;

public class FindPathInUndirectedGraphDFSIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        List<Integer> path = dfsIterative(adj, n, start, end);
        if (path != null) {
            for (int node : path) {
                System.out.print(node + " ");
            }
            System.out.println();
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    private static List<Integer> dfsIterative(List<List<Integer>> adj, int n, int start, int end) {
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (node == end) {
                // reconstruct path
                List<Integer> path = new ArrayList<>();
                for (int cur = end; cur != -1; cur = parent[cur]) {
                    path.add(cur);
                }
                Collections.reverse(path);
                return path;
            }
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = node;
                    stack.push(neighbor);
                }
            }
        }
        return null;
    }
}

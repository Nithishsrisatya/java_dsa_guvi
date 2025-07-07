/* 
 * "Vertex Cover on Trees", 
"Find the minimum number of vertices to cover all edges in a tree.", 
"Medium", 
"Codeforces, Google"

----------------------------------

Problem Title: Vertex Cover on Trees

Problem Description:
Given an undirected tree with N vertices, find the minimum number of vertices you need to select such that every edge in the tree has at least one of its endpoints selected. This set of selected vertices is called a vertex cover of the tree. Output the size of the minimum vertex cover.

Input Format:
- The first line contains a single integer N (the number of vertices in the tree).
- The next N-1 lines each contain two integers u and v, denoting an edge between vertex u and vertex v.

Output Format:
- Output a single integer: the size of the minimum vertex cover.

Constraints:
- 1 ≤ N ≤ 10^5
- 1 ≤ u, v ≤ N
- The given graph is a tree (connected and acyclic).

Sample Input 1:
4
1 2
1 3
3 4

Sample Output 1:
2

Explanation:
One possible minimum vertex cover is {1, 3}. All edges are covered.

Sample Input 2:
3
1 2
2 3

Sample Output 2:
1

Explanation:
Selecting vertex 2 covers both edges.

Difficulty:
Medium

Test Cases:

Test Case 1:
Input:
2
1 2
Output:
1

Test Case 2:
Input:
5
1 2
1 3
3 4
3 5
Output:
2

Test Case 3:
Input:
6
1 2
1 3
2 4
2 5
3 6
Output:
2

Test Case 4:
Input:
7
1 2
1 3
2 4
2 5
3 6
6 7
Output:
3

Test Case 5:
Input:
1
Output:
0

 */
import java.util.*;
public class VertexCoverTree {
    static List<Integer>[] tree;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) tree[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }
        dp = new int[n + 1][2];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(dfs(1, 0, -1));
        sc.close();
    }

    // state: u = current node, take = 0/1 (not taken/taken), par = parent
    static int dfs(int u, int take, int par) {
        if (dp[u][take] != -1) return dp[u][take];
        int res = 0;
        if (take == 1) {
            res = 1;
            for (int v : tree[u]) {
                if (v != par) {
                    res += Math.min(dfs(v, 0, u), dfs(v, 1, u));
                }
            }
        } else {
            for (int v : tree[u]) {
                if (v != par) {
                    res += dfs(v, 1, u);
                }
            }
        }
        return dp[u][take] = res;
    }
}

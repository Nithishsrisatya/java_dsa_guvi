/* 
 * 02 
"Connected Components Count", 
"Given a graph, count the number of connected components using DFS.", 
"Medium", 
"LeetCode, Amazon"
----------------------------------
Problem Title:
Connected Components Count

Problem Description:
Given an undirected graph with n nodes labeled from 0 to n-1 and a list of edges, count the number of connected components in the graph. Two nodes are in the same connected component if there is a path between them (directly or indirectly).

Input Format:
- The first line contains two integers n and m, the number of nodes and the number of edges.
- The next m lines each contain two integers u and v, representing an undirected edge between nodes u and v.

Output Format:
- A single integer representing the number of connected components in the graph.

Constraints:
- 1 <= n <= 10^5
- 0 <= m <= 2 * 10^5
- 0 <= u, v < n

Sample Input:
5 3
0 1
1 2
3 4

Sample Output:
2

Explanation:
There are two connected components: {0,1,2} and {3,4}.

Difficulty:
Medium

Test Cases:
Test Case 1:
Input:
4 2
0 1
2 3
Output:
2

Test Case 2:
Input:
3 0
Output:
3

Test Case 3:
Input:
6 5
0 1
1 2
2 3
3 4
4 5
Output:
1

Test Case 4:
Input:
7 4
0 1
1 2
3 4
5 6
Output:
3

Test Case 5:
Input:
1 0
Output:
1
----------------------------------

 */
import java.util.*;
public class ConnectedComponentsCount {
    private static void dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int node) {
        visited[node] = true;
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited[neighbor]) {
                dfs(graph, visited, neighbor);
            }
        }
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int edges = obj.nextInt();
        Map<Integer, List<Integer>> graph =  new HashMap<>();
        for(int i = 0;i < edges;i++){
            int u = obj.nextInt();
            int v = obj.nextInt();
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        int connectedComponents = 0;
        for(int i = 0;i < n;i++){
            if(!visited[i]){
                connectedComponents++;
                dfs(graph, visited, i);
            }
        }
        System.out.println(connectedComponents);
        
        obj.close();
    }
}

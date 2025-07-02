/* 
 * 04
"Shortest Path in Unweighted Graph", 
"Find the shortest path between two nodes in an unweighted graph using BFS.", 
"Easy", 
"LeetCode, Facebook"
----------------------------------
Problem Title:
Shortest Path in Unweighted Graph

Problem Description:
Given an unweighted, undirected graph and two nodes, source and destination, find the length of the shortest path between the source and destination nodes. If there is no path between the two nodes, return -1.

Input Format:
- The first line contains three integers n, m, and q, where n is the number of nodes (numbered from 1 to n), m is the number of edges, and q is the number of queries.
- The next m lines each contain two integers u and v, representing an undirected edge between nodes u and v.
- The next q lines each contain two integers s and d, representing a query to find the shortest path from node s to node d.

Output Format:
- For each query, output a single integer: the length of the shortest path between s and d, or -1 if no such path exists.

Constraints:
- 1 ≤ n ≤ 10^4
- 0 ≤ m ≤ 2×10^4
- 1 ≤ q ≤ 10^3
- 1 ≤ u, v, s, d ≤ n

Sample Input:
5 5 2
1 2
2 3
3 4
4 5
1 5
1 5
2 4

Sample Output:
1
2

Explanation:
- For the first query (1 to 5), there is a direct edge, so the shortest path length is 1.
- For the second query (2 to 4), the shortest path is 2: 2 -> 3 -> 4.

Difficulty:
Easy

Five Test Cases:
Test Case 1:
Input:
4 3 1
1 2
2 3
3 4
1 4
Output:
3

Test Case 2:
Input:
3 1 1
1 2
2 3
Output:
-1

Test Case 3:
Input:
6 7 2
1 2
1 3
2 4
3 4
4 5
5 6
3 6
1 6
2 5
Output:
3
2

Test Case 4:
Input:
2 0 1
1 2
1 2
Output:
-1

Test Case 5:
Input:
5 4 1
1 2
2 3
3 4
4 5
1 3
Output:
2
----------------------------------

 */
import java.util.*;
 public class FindTheShortestPath {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int edges = obj.nextInt();
        int queries = obj.nextInt();
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int i = 1;i <= n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int i = 0;i < edges;i++){
            int u = obj.nextInt();
            int v = obj.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i = 0;i < queries;i++){
            int start = obj.nextInt();
            int destination = obj.nextInt();
            int result = bfs(graph, start, destination);
            System.out.println(result);
        }
        
        obj.close();
    }
    static int bfs(Map<Integer,List<Integer>> graph,int start,int destination){
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visited = new ArrayList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        queue.offer(start);
        visited.add(start);
        parent.put(start, -1);
        boolean found = false;
        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current == destination){
                found = true;
                break;
            }
            for(int neighbor : graph.get(current)){
                if(!visited.contains(neighbor)){
                    queue.offer(neighbor);
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                }
            }
        }
        if(!found){
           return -1;
        }
        List<Integer> path = new ArrayList<>();
        int cur = destination;
        while(cur != -1){
            path.add(cur);
            cur = parent.get(cur);
        }
        Collections.reverse(path);
        return path.size() - 1; 
    }
}

import java.util.*;
public class BfsWithDistance {
    public static void main(String[] args){
        Map<Integer,List<Integer>> graph = new HashMap<>();
        graph.put(1,Arrays.asList(2,3));
        graph.put(2,Arrays.asList(1,4));
        graph.put(3,Arrays.asList(1,4));
        graph.put(4,Arrays.asList(2,3));
        bfs(graph,1);
    }
    static void bfs(Map<Integer,List<Integer>> graph,int start){
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visited = new ArrayList<>();
        Map<Integer, Integer> distance = new HashMap<>();
        queue.offer(start);
        visited.add(start);
        distance.put(start, 0);
        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.println("Visited: " + current + ", Distance: " + distance.get(current));
            for(int neighbor : graph.get(current)){
                if(!visited.contains(neighbor)){
                    queue.offer(neighbor);
                    visited.add(neighbor);
                    distance.put(neighbor, distance.get(current) + 1);
                }
            }
        }
    }
}
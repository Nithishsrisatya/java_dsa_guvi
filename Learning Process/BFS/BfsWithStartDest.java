import java.util.*;

public class BfsWithStartDest {
     public static void main(String[] args){
        Map<Integer,List<Integer>> graph = new HashMap<>();
        graph.put(1,Arrays.asList(2,3));
        graph.put(2,Arrays.asList(1,4));
        graph.put(3,Arrays.asList(1,4));
        graph.put(4,Arrays.asList(2,3));
        bfs(graph,1,4);
    }
    static void bfs(Map<Integer,List<Integer>> graph,int start,int destination){
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
            System.out.println("No path is Found from " + start + " to " + destination);
        }
        else{
            List<Integer> path = new ArrayList<>();
            int cur = destination;
            while(cur != -1){
                path.add(cur);
                cur = parent.get(cur);
            }
            Collections.reverse(path);
            System.out.println(path);
            System.out.println("Path Length: " + (path.size() - 1));
        }
    }
}

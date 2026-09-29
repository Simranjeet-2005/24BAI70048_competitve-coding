import java.util.*;
public class bfs {
    public static boolean hasPath(List<List<Integer>> graph, int source, int destination) {
        boolean[] visited=new boolean[graph.size()];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(source);
        visited[source]=true;
        while(!queue.isEmpty()){
            int current=queue.poll();
            if(current == destination){
                return true;
            }
            for(int neighbor : graph.get(current)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.print("Enter number of edges: ");
        int e=sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println("Enter the edges (u v):");
        for(int i = 0; i < e; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.print("Enter source node: ");
        int source=sc.nextInt();
        System.out.print("Enter destination node: ");
        int destination=sc.nextInt();
        if (hasPath(graph, source, destination)){
            System.out.println("Path exists between " +source+" and "+destination);
        } else {
            System.out.println("No path exists between " +source+" and "+destination);
        }
        sc.close();
    }
}
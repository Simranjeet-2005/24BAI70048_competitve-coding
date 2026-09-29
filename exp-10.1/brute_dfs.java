import java.util.*;
public class brute_dfs{
    static boolean dfs(List<List<Integer>> graph, int current,int destination, boolean[] visited) {
        if(current==destination) {
            return true;
        }
        visited[current]=true;
        for(int neighbor : graph.get(current)) {
            if(!visited[neighbor]){
                if(dfs(graph, neighbor, destination, visited)){
                    return true;
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
        for (int i=0;i< n;i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println("Enter edges (u v):");
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.print("Enter source: ");
        int source=sc.nextInt();
        System.out.print("Enter destination: ");
        int destination=sc.nextInt();
        boolean[] visited=new boolean[n];
        if (dfs(graph, source, destination, visited)) {
            System.out.println("Path exists");
        } else {
            System.out.println("No path exists");
        }
        sc.close();
    }
}
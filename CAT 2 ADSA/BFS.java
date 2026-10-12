import java.util.*;
public class BFS {
    static ArrayList<Integer> bfs(int V, int startnode, ArrayList<ArrayList<Integer>> list) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> bfsresult = new ArrayList<>();
        boolean[] visited = new boolean[V + 1];
        q.add(startnode);
        visited[startnode] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            bfsresult.add(node);
            for (int i : list.get(node)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return bfsresult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();
        System.out.print("Enter start node: ");
        int startnode = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println("Enter " + E + " edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }
        System.out.println("BFS traversal: " + bfs(V, startnode, list));
        sc.close();
    }
}

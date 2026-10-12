import java.util.*;
public class DFS {
    static ArrayList<Integer> dfs(int V, int startnode, ArrayList<ArrayList<Integer>> list) {
        ArrayList<Integer> dfsresult = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[V + 1];
        s.push(startnode);
        visited[startnode] = true;
        while (!s.isEmpty()) {
            int node = s.pop();
            dfsresult.add(node);
            for (int i : list.get(node)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    s.push(i);
                }
            }
        }
        return dfsresult;
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
        System.out.println("DFS traversal: " + dfs(V, startnode, list));
        sc.close();
    }
}

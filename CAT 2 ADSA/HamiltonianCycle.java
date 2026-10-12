import java.util.Scanner;
public class HamiltonianCycle {
    static int n;
    static int[][] graph;
    static int[] path;
    static boolean isSafe(int v, int pos) {
        if (graph[path[pos - 1]][v] == 0) {
            return false;
        }
        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return false;
            }
        }
        return true;
    }
    static void hamiltonian(int pos) {
        if (pos == n) {
            if (graph[path[n - 1]][path[0]] == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.print(path[i] + " ");
                }
                System.out.println(path[0]);
            }
            return;
        }
        for (int v = 0; v < n; v++) {
            if (isSafe(v, pos)) {
                path[pos] = v;
                hamiltonian(pos + 1);
                path[pos] = -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();
        graph = new int[n][n];
        path = new int[n];
        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter starting vertex: ");
        path[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            path[i] = -1;
        }
        hamiltonian(1);
        sc.close();
    }
}

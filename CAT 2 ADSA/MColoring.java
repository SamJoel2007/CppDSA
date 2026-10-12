import java.util.*;
public class MColoring {
    static boolean isSafe(int i, int j, int[][] arr, int[] colors, int n) {
        for (int k = 0; k < n; k++) {
            if (arr[i][k] == 1 && colors[k] == j) {
                return false;
            }
        }
        return true;
    }
    static void f(int i, int[][] arr, int[] colors, int n, int m) {
        if (i == n) {
            System.out.println(Arrays.toString(colors));
            return;
        }
        for (int j = 1; j <= m; j++) {
            if (isSafe(i, j, arr, colors, n)) {
                colors[i] = j;
                f(i + 1, arr, colors, n, m);
                colors[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter number of colors: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the adjacency matrix (" + n + " x " + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] colors = new int[n];
        System.out.println("Possible colorings:");
        f(0, arr, colors, n, m);
        sc.close();
    }
}
 

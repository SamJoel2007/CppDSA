import java.util.Scanner;
public class Apsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int INF = 999;
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();
        int[][] dp = new int[n][n];
        System.out.println("Enter the cost matrix (use " + INF + " for no direct edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = sc.nextInt();
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dp[i][j] > dp[i][k] + dp[k][j]) {
                        dp[i][j] = dp[i][k] + dp[k][j];
                    } else {
                        dp[i][j] = dp[i][j];
                    }
                }
            }
        }
        System.out.println("All pairs shortest path matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

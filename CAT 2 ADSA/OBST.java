import java.util.Scanner;
public class OBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of keys: ");
        int n = sc.nextInt();
        int freq[] = new int[n];
        System.out.println("Enter frequencies of " + n + " keys (in sorted key order):");
        for (int i = 0; i < n; i++) {
            freq[i] = sc.nextInt();
        }
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = freq[i];
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += freq[k];
                }
                dp[i][j] = Integer.MAX_VALUE;
                for (int r = i; r <= j; r++) {
                    int left = 0;
                    int right = 0;
                    if (i < r) {
                        left = dp[i][r - 1];
                    }
                    if (j > r) {
                        right = dp[r + 1][j];
                    }
                    int cost = left + right + sum;
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }
        System.out.println("Minimum cost of OBST: " + dp[0][n - 1]);
        sc.close();
    }
}

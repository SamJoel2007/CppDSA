import java.util.Scanner;
public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int weight[] = new int[n];
        int value[] = new int[n];
        System.out.println("Enter weights of " + n + " items:");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        System.out.println("Enter values of " + n + " items:");
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        System.out.print("Enter knapsack capacity: ");
        int cap = sc.nextInt();
        int dp[][] = new int[n + 1][cap + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cap; j++) {
                if (weight[i - 1] <= j) {
                    int take = value[i - 1] + dp[i - 1][j - weight[i - 1]];
                    int dont = dp[i - 1][j];
                    dp[i][j] = Math.max(take, dont);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println("profit" + " " + dp[n][cap]);
        sc.close();
    }
}

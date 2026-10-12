import java.util.Scanner;
public class SumOfSubsets {
    static int[] a;
    static int target;
    static void subset(int index, int sum, String result) {
        if (sum == target) {
            System.out.println(result);
            return;
        }
        if (index == a.length || sum > target) {
            return;
        }
        // Include the current element
        subset(index + 1, sum + a[index], result + a[index] + " ");
        // Exclude the current element
        subset(index + 1, sum, result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        target = sc.nextInt();
        System.out.println("Subsets with sum " + target + ":");
        subset(0, 0, "");
        sc.close();
    }
}

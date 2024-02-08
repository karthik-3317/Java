import java.util.Scanner;

public class BeingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for (int i = 0; i <= range; i++) {
            System.out.println( i + ": " + countBits(i));
        }
    }

    public static int countBits(int num) {
        int[] dp = new int[num + 1];

        // Base case
        dp[0] = 0;

        for (int i = 1; i <= num; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }

        return dp[num];
    }
}

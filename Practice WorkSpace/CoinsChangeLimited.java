import java.util.*;
public class CoinsChangeLimited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ws = sc.nextInt();
        int wallet[] = new int[ws];
        for (int i = 0; i < ws; i++) {
            wallet[i] = sc.nextInt();
        }
        int qs = sc.nextInt();
        int quries[] = new int[qs];
        int targetMax = Integer.MIN_VALUE;
        for (int i = 0; i < qs; i++) {
            int temp = sc.nextInt();
            quries[i] = temp;
            targetMax = Math.max(targetMax, quries[i]);
        }
        long dp[][] = new long[ws + 1][targetMax + 1];
        for (int i = 0; i <= ws; i++) {
            Arrays.fill(dp[i], 0);
        }
        for (int j = 0; j <= targetMax; j++) {
            dp[0][j] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= ws; i++) {
            for (int j = 1; j <= targetMax; j++) {
                long exc = dp[i - 1][j - 1];
                long inc = Integer.MAX_VALUE;
                if (wallet[i - 1] <= j) {
                    inc = 1 + dp[i][j - wallet[i - 1]];
                }
                dp[i][j] = Math.min(exc, inc);
            }
        }
        System.out.println("Printing the Ways for each Queries");
        for (int i : quries) {
            System.out.println(dp[ws][i]);
        }
    }
}

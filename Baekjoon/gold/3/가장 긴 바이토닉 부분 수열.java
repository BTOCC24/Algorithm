import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[][] dp = new int[2][n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i < n + 1; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            dp[0][i] = 1;
            for (int j = i - 1; j > 0; j--) {
                if (arr[j] < arr[i] && dp[0][j] >= dp[0][i])
                    dp[0][i] = dp[0][j] + 1;
            }
        }

        for (int i = n; i >= 1; i--) {
            dp[1][i] = 1;
            for (int j = i + 1; j <= n; j++) {
                if (arr[j] < arr[i] && dp[1][j] >= dp[1][i])
                    dp[1][i] = dp[1][j] + 1;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            dp[0][i] += dp[1][i];
            if (max < dp[0][i])
                max = dp[0][i];
        }

        System.out.print(max - 1);
    }
}
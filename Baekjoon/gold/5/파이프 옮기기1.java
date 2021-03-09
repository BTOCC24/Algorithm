//19:43

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n + 1][n + 1];
        int[][][] dp = new int[3][n + 1][n + 1];

        dp[0][1][2] = 1;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (i == 1 && j == 2 || map[i][j] == 1)
                    continue;

                dp[0][i][j] = dp[0][i][j - 1] + dp[1][i][j - 1];
                dp[2][i][j] = dp[1][i - 1][j] + dp[2][i - 1][j];

                if (map[i][j-1] == 1 || map[i-1][j] == 1)
                    continue;

                dp[1][i][j] = dp[0][i - 1][j - 1] + dp[1][i - 1][j - 1] + dp[2][i - 1][j - 1];

            }
        }

        System.out.println(dp[0][n][n] + dp[1][n][n] + dp[2][n][n]);

    }
}
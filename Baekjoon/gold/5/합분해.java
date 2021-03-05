//1:22

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        final int DIV = 1000000000;
        int[][] dp = new int[k + 1][n + 1];

        for (int i = 1; i <= k; i++) {
            dp[i][1] = i;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % DIV;
            }
        }
        System.out.println(dp[k][n]);
    }
}

//20
//0 20
//1 19

//2:10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Integer.parseInt(split[j-1]);
                if (dp[i][j] == 1){
                    dp[i][j] += Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
                    if (dp[i][j] > max)
                        max = dp[i][j];
                }
            }
        }
        System.out.print(max*max);
//        for(int[] x : dp)
//            System.out.println(Arrays.toString(x));
    }
}
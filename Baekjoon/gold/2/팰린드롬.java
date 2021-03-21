//23:17

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[][] dp = new int[n + 1][n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) { // one letter
            dp[1][i] = 1;


            if (arr[i - 1] == arr[i])
                dp[2][i - 1] = 1;
        }

        for (int i = 3; i <= n; i++) { // j index에서 i 글자
            for (int j = 1; j <= n; j++) {
                if (i + j - 1 > n) {
                    break;
                }
                if (arr[j] == arr[i + j - 1] && dp[i - 2][j + 1] == 1)
                    dp[i][j] = 1;

            }
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            sb.append(dp[e-s+1][s] + "\n");
        }
        System.out.print(sb.toString());
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n + 1][n + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= i; j++){
                if (j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = (dp[i-1][j - 1] + dp[i-1][j]) % 10007;
            }
        }
        System.out.print(dp[n][k]);


        /**
         *  1
         *  1 1 (A+B)  1 C0 1C 1
         *  1 2 1  (A+B)^2 2C0 2C1 2C2
         *  1 3 3 1 (A+B)^3
         *  1 4 6 4 1
         *  1 5 10 10 5 1
         */
    }
}
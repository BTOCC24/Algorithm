import java.io.*;

public class Main {
    static final int DIV = 1000000000;
    static int n;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new long[n + 1][10];

        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][9] = dp[i-1][8];
            for (int j = 1; j < 9; j++)
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % DIV;
        }

        long result = 0;
        for(int i = 0; i< 10; i++){
            result += dp[n][i];
        }
        System.out.println(result % DIV);
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        final int DIV = 9901;

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][3];

        Arrays.fill(dp[1], 1);
        for(int i = 2; i<= n; i++){
            dp[i][0] = Arrays.stream(dp[i-1]).sum() % DIV;
            dp[i][1] = (Arrays.stream(dp[i-1]).sum() - dp[i-1][1]) % DIV;
            dp[i][2] = (Arrays.stream(dp[i-1]).sum() - dp[i-1][2]) % DIV;
        }

        int result = (dp[n][0] + dp[n][1] + dp[n][2]) % DIV;
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}


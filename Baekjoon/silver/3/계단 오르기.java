import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] stair;
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        stair = new int[N + 1];
        dp = new Integer[N + 1];

        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = stair[0];
        dp[1] = stair[1];
        if (N >= 2)
            dp[2] = stair[1] + stair[2];

        System.out.println(find(N));
    }

    private static int find(int n) {
        if (dp[n] == null){
            dp[n] = Math.max(find(n-2), find(n-3) + stair[n-1]) + stair[n];
        }
        return dp[n];
    }
}
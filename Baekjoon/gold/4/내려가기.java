import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 22:24
public class Main {
    static int n;
    static int[][] map;
    static int[][][] dp; // 0 : min, 1 : max

    public static void main(String[] args) throws IOException {
        init();
        runDp();
        print();
    }

    private static void print() {
        System.out.println(Arrays.stream(dp[1][n]).max().getAsInt() + " " + Arrays.stream(dp[0][n]).min().getAsInt());
    }

    private static void runDp() {
        for(int i = 2; i <= n; i++){
            dp[0][i][0] = Math.min(dp[0][i-1][0], dp[0][i-1][1]) + map[i][0];
            dp[0][i][1] = Math.min(dp[0][i-1][0], Math.min(dp[0][i-1][1], dp[0][i-1][2]))  + map[i][1];
            dp[0][i][2] = Math.min(dp[0][i-1][1], dp[0][i-1][2]) + map[i][2];

            dp[1][i][0] = Math.max(dp[1][i-1][0], dp[1][i-1][1]) + map[i][0];
            dp[1][i][1] = Math.max(dp[1][i-1][0], Math.max(dp[1][i-1][1], dp[1][i-1][2]))  + map[i][1];
            dp[1][i][2] = Math.max(dp[1][i-1][1], dp[1][i-1][2]) + map[i][2];
        }
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n + 1][3];
        dp = new int[2][n + 1][3];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][1] = Arrays.copyOf(map[1], map[1].length);
        dp[1][1] = Arrays.copyOf(map[1], map[1].length);
    }
}
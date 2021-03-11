import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int[][] map;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n + 2][m + 2];
        dp = new int[n + 2][m + 2];
        dp[1][1] = 1;

        for(int i = 1; i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        System.out.println(dfs(1,1));

        for(int[] x : dp){
            System.out.println(Arrays.toString(x));
        }
    }

    private static int dfs(int y, int x) {
        if(y == n && x == m)
            return 1;

        if (dp[y][x] != -1)
            return dp[y][x];

        dp[y][x]=0;
        for(int i = 0 ; i < 4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 1 || ny > n || nx < 1 || nx > m)
                continue;

            if (map[y][x] > map[ny][nx]){
                dp[y][x] += dfs(ny,nx);
            }
        }
        return dp[y][x];
    }
}

/**
 * 1)   1   1   1   1   1
 * 2)   1   0   0   1   1
 * 3)
 */

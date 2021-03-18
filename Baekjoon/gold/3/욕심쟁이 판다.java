//01:43

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] dx;
    static int[] dy;
    static int[][] map;
    static int[][] dp;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{-1, 0, 1, 0};

        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n + 2][n + 2];
        dp = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                max = Math.max(max, dfs(i, j));
            }
        }
        System.out.println(max + 1);
    }

    private static int dfs(int y, int x) {
        if (dp[y][x] != 0)
            return dp[y][x];

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 1 || ny > n || nx < 1 || nx > n) {
                continue;
            }
            if (map[y][x] < map[ny][nx])
                dp[y][x] = Math.max(dp[y][x], dfs(ny, nx) + 1);
        }
        return dp[y][x];
    }
}
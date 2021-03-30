// 20:30

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int len, r ,c;
    static boolean[] alpha;
    static int[] dx, dy;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        len = 1;
        alpha = new boolean[26];
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{-1, 0, 1, 0};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        for (int i = 0; i < r; i++)
            map[i] = br.readLine().toCharArray();

        alpha[map[0][0] - 'A'] = true;
        dfs(0, 0, 1);

        System.out.println(len);
    }

    private static void dfs(int y, int x, int depth) {
        len = Math.max(len, depth);

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || ny >= r || nx < 0 || nx >= c)
                continue;

            int index = map[ny][nx] - 'A';
            if (alpha[index])
                continue;

            alpha[index] = true;
            dfs(ny, nx, depth + 1);
            alpha[index] = false;
        }
    }
}
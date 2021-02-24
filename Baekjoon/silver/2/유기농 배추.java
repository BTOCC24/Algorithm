import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int testCase, n, m, k, result;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testCase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            map = new int[n][m];
            for (int b = 0; b < k; b++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            result = 0;
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (map[y][x] == 1) {
                        result++;
                        dfs(y, x);
                    }
                }
            }
            System.out.println(result);
        }
    }

    private static void dfs(int y, int x) {
        map[y][x] = 0;
        for (int index = 0; index < 4; index++){
            int nx = x + dx[index];
            int ny = y + dy[index];
            if (nx >= 0 && nx < m && ny >= 0 && ny < n && map[ny][nx] == 1)
                dfs(ny, nx);
        }
    }
}
// 1:01

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        map = new int[n + 1][m + 1];
        queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1){
                    queue.offer(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()){
            int[] p = queue.poll();
            for(int i = 0 ; i< 4; i++){
                int ny = p[0] + dy[i];
                int nx = p[1] + dx[i];
                if(nx <= 0 || nx > m || ny <= 0 || ny > n || map[ny][nx] != 0){
                    continue;
                }
                map[ny][nx] = map[p[0]][p[1]] + 1;
                queue.offer(new int[]{ny, nx});
            }
        }

        int max = -2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] == 0){
                    System.out.print(-1);
                    return;
                }
                max = Math.max(max, map[i][j]);
            }
        }
        System.out.print(max-1);
    }

}
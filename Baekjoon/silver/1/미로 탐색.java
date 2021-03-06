// 22 :11

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        int[][] graph = new int[n + 1][m + 1];
        boolean[][] visited = new boolean[n + 1][m + 1];
        Queue<Point> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            char[] split = br.readLine().toCharArray();
            for (int j = 1; j <= m; j++) {
                graph[i][j] = split[j - 1] - '0';
            }
        }

        queue.offer(new Point(1,1));
        visited[1][1] = true;
        while(queue.size() != 0){
            Point p = queue.poll();
            int x = p.x;
            int y = p.y;

            for(int i = 0 ; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 1 || nx > m || ny < 1 || ny > n || graph[ny][nx] == 0 | visited[ny][nx]){
                    continue;
                }
                graph[ny][nx] = graph[y][x] + 1;
                visited[ny][nx] = true;
                queue.offer(new Point(ny, nx));
            }
        }

        System.out.println(graph[n][m]);
    }
    static class Point{
        int x, y;

        public Point(int y, int x) {
            this.x = x;
            this.y = y;
        }
    }
}
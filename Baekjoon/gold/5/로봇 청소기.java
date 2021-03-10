//23:54

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        int[][] map = new int[n][m];
        int[][] visited = new int[n][m];
        int count = 1;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[r][c] = 1;
        while(true) {
            int turnCount = 0;
            for(turnCount = 0; turnCount < 4; turnCount++) {
                d = (d + 3) % 4;
                int ny = r + dy[d];
                int nx = c + dx[d];
                //System.out.println(ny +" "  +nx);
                if(map[ny][nx] == 0 && visited[ny][nx] == 0){
                    r = ny;
                    c = nx;
                    visited[r][c] = 1;
                    count++;
                    break;
                }
            }

            if (turnCount == 4){
                r -= dy[d];
                c -= dx[d];
                if (map[r][c] == 1)
                    break;
            }

        }
        System.out.print(count);

    }
}
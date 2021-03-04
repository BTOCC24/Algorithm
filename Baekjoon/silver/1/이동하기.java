import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 23:00
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n + 1][m + 1];

        for(int i = 1; i <=n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                map[i][j] += Math.max(map[i-1][j-1], Math.max(map[i][j-1], map[i-1][j]));

            }
        }
        System.out.println(map[n][m]);

    }
}

//0 0 0 0 0
//0 1 2 3 4
//0 0 2 3 9
//0 9 17 24 33
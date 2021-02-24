import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int min = Integer.MAX_VALUE;

    static boolean[] visited;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(min);
    }

    private static void dfs(int depth, int start) {
        if (depth == N / 2) {
            min = Math.min(min, diff());
            return;
        }
        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }

    private static int diff() {
        int team_start = 0;
        int team_link = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    team_start += arr[i][j];
                    team_start += arr[j][i];
                } else if (visited[i] == false && visited[j] == false){
                    team_link += arr[i][j];
                    team_link += arr[j][i];
                }
            }
        }
        return Math.abs(team_start - team_link);
    }
}
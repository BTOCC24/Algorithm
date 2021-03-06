import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 23:01
public class Main {
    static boolean[] check;
    static boolean[][] graph;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int pairSize = Integer.parseInt(br.readLine());

        check = new boolean[n + 1];
        graph = new boolean[n + 1][n + 1];
        StringTokenizer st;

        for (int i = 0; i < pairSize; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            graph[p][q] = true;
            graph[q][p] = true;
        }

        dfs(1);
        System.out.println(count - 1);
    }

    static void dfs(int index) {
        check[index] = true;
        count++;
        for (int i = 1; i <= graph[index].length - 1; i++) {
            if(graph[index][i] && !check[i]){
                dfs(i);
            }

        }
    }
}
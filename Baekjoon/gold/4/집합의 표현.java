import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        parent = new int[n + 1];
        for(int i = 1; i <= n; i++)
            parent[i] = i;

        for(int T = 0; T < m; T++){
            st = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (q == 0){
                union(a, b);
            }else{
                sb.append(check(a,b) + "\n");
            }
        }

        System.out.print(sb.toString());

    }

    private static String check(int a, int b) {
        return (findP(a) == findP(b)) ? "YES" : "NO";
    }

    private static void union(int a, int b) {
        int x = findP(a);
        int y = findP(b);

        if (x < y){
            parent[y] = x;
        }else if (x > y){
            parent[x] = y;
        }
    }

    private static int findP(int a) {
        if (parent[a] == a){
            return a;
        }else{
            return parent[a] = findP(parent[a]);
        }
    }
}
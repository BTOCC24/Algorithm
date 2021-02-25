import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Integer[][][] w = new Integer[21][21][21];
    static int a, b, c;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            print(a, b, c);
        }
    }

    private static void print(int a, int b, int c) {
        if (a == -1 && b == -1 && c == -1){
            System.out.print(sb.toString());
            System.exit(0);
        }
        int result = dp(a,b,c);
        sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(result).append('\n');
    }

    private static int dp(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0){
            return 1;
        } else if (a > 20 || b > 20 || c > 20){
            return dp(20, 20, 20);
        } else if (w[a][b][c] != null){
            return w[a][b][c];
        } else if (a < b && b < c){
            w[a][b][c] = dp(a, b, c-1) + dp(a, b-1, c-1) - dp(a, b-1, c);
            return w[a][b][c];
        } else {
            w[a][b][c] = dp(a-1, b, c) + dp(a-1, b-1, c) + dp(a-1, b, c-1) - dp(a-1, b-1, c-1);
            return w[a][b][c];
        }
    }
}
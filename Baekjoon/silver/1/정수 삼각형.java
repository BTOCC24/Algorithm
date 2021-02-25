import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] square;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        square = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < N; i++) {
            square[i][0] += square[i-1][0];
            for (int j = 1; j < i; j++) {
                square[i][j] += Math.max(square[i-1][j-1], square[i-1][j]);
            }
            square[i][i] += square[i-1][i-1];
        }

        int mx = -1;
        for(int i = 0; i< N; i ++){
            if (square[N-1][i] > mx)
                mx = square[N-1][i];
        }
        System.out.print(mx);
    }

}
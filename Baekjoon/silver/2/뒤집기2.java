import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // init
        int n, m;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        String[] strings = new String[n];
        int[][] counts = new int[n][m];
        int result = 0;
        for (int i = 0; i < n; i++)
            strings[i]  = br.readLine();

        for (int row = n - 1; row >= 0; row--) {
            for (int col = m - 1; col >= 0; col--) {
                if (strings[row].charAt(col) == '1' && counts[row][col] == 0 ||
                        strings[row].charAt(col) == '0' && counts[row][col] == 1){
                    result++;
                    for(int x = 0; x <= row; x++){
                        for(int y = 0; y <=col; y++){
                            counts[x][y] ^= 1;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}

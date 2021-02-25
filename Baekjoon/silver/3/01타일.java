// 19 : 28

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static long[] tile = new long[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Arrays.fill(tile, -1);
        tile[1] = 1;
        tile[2] = 2;
        for (int i = 3; i <= N; i++) {
            tile[i] = (tile[i-1] + tile[i-2]) % 15746;
        }
        System.out.println(tile[N]);
    }
}
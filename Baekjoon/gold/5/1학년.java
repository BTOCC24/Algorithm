//// 20:36
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    static long count;
//    static int n;
//    static boolean[] visited;
//    static int[] value;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
//        value = new int[n + 1];
//        visited = new boolean[n + 1];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for(int i = 1; i<= n ; i ++){
//            value[i] = Integer.parseInt(st.nextToken());
//        }
//
//        dfs(1, 0);
//        System.out.print(count);
//    }
//
//    private static void dfs(int depth, int result) {
//        if (result < 0 || result > 20)
//            return;
//        if (depth == n){
//            if (result == value[n]) {
//                count++;
//            }
//            return;
//        }
//        dfs(depth + 1, result + value[depth]);
//        dfs(depth + 1, result - value[depth]);
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[][] dp = new long[n][21];
        dp[1][Integer.parseInt(st.nextToken())]++;

        for (int i = 2; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            for (int j = 0; j <= 20; j++) {
                if (dp[i - 1][j] > 0) {
                    if (j - val >= 0)
                        dp[i][j - val] += dp[i - 1][j];
                    if (j + val <= 20)
                        dp[i][j + val] += dp[i - 1][j];
                }
            }

        }

        System.out.print(dp[n - 1][Integer.parseInt(st.nextToken())]);

    }
}
//0526

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[][] data = new int[n + 1][2];
        int[] dp = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            data[i][0] = Integer.parseInt(st.nextToken());
            data[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(data, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        //System.out.println(Arrays.deepToString(data));
        for (int i = 1; i <= n; i++) {
            dp[i] = 1;
            for(int j = i - 1; j > 0; j--){
                if (data[j][1] < data[i][1] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
            System.out.println(dp[i]);
        }

        int mx = 0;
        for(int i = 1; i <= n; i++){
            if (mx < dp[i])
                mx = dp[i];
        }
        System.out.print(n - mx);
    }
}

//18
//22
//39
//41
//64
//76
//97
//1010
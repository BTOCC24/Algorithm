import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = 1;
        for(int i = 2; i <= n; i ++){
            int ml = 0;
            for(int j = i - 1; j > 0; j--){
                if (arr[i] > arr[j] && ml < dp[j]){
                    ml = dp[j];
                }
            }
            dp[i] = ml + 1;
        }

        int mx = 0;
        for (int i = 1 ; i <= n; i++) {
            if (mx < dp[i]) {
                mx = dp[i];
            }
        }
        System.out.println(mx);
    }
}
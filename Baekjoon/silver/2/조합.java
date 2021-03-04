import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger[] dp = new BigInteger[n + 1];
        for(int i = 0; i <= n; i++){
            dp[i] = BigInteger.valueOf(0);
        }
        dp[0] = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--){
                dp[j] = dp[j].add(dp[j - 1]);
            }
        }
        System.out.println(dp[m]);
    }
}
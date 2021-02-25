import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 16 55
public class Main {
    static int T;
    static Integer[][] dp = new Integer[41][2];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();
        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T;i++){
            int value = Integer.parseInt(br.readLine());
            sb.append(dp[value][0] + " " + dp[value][1] + "\n");
        }
        System.out.print(sb.toString());
    }

    private static void init() {
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for(int i = 2; i < dp.length; i++){
            dp[i][0] = dp[i-2][0] + dp[i-1][0];
            dp[i][1] = dp[i-2][1] + dp[i-1][1];
        }

    }

}
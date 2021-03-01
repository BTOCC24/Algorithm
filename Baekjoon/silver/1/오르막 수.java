import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[10];
        Arrays.fill(dp, 1);

        for(int i = 1; i < n; i++){
            for(int j = 1; j <10; j++){
                dp[j] = (dp[j] + dp[j-1]) % 10007;
            }
        }
        System.out.print(Arrays.stream(dp).sum() % 10007);
    }
}


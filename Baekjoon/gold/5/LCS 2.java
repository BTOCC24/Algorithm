import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();

        int n = str2.length;
        int m = str1.length;
        String[][] dp = new String[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = "";
                if (i == 0 || j == 0)
                    continue;

                if (str2[i - 1] == str1[j - 1]) {
                    dp[i][j] = dp[i-1][j-1] + str1[j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j].length() > dp[i][j - 1].length() ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }
        System.out.println(dp[n][m].length());
        System.out.print(dp[n][m]);
    }
}

/**
 *     A   C   A   Y   K   P
 * C   0   1   1   1   1   1
 * A   1   1   2   2   2   2
 * P   1   1   2
 * C
 * A
 * K
 */
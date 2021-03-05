import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int longest = 1;
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            dp[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    longest = Math.max(longest, dp[i]);
                }
            }
        }
        sb.append(longest + "\n");

        int value = longest;
        Stack<Integer> stk = new Stack<>();
        for (int i = n; i >= 1; i--) {
            if (dp[i] == value){
                stk.push(arr[i]);
                value--;
            }
        }

        while (!stk.isEmpty()){
            sb.append(stk.pop() + " ");
        }

        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}


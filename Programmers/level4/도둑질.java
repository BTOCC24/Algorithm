import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.print(sol.solution(new int[]{1000, 1, 0, 1, 2, 1000, 0}));
    }
}

class Solution {
    public int solution(int[] money) {
        int size = money.length;
        int[] dp = new int[size];
        int[] dp2 = new int[size];

        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);
        dp2[1] = money[1];

        for (int i = 2; i < size; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + money[i]);
            if(i < size - 1) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + money[i]);
            }
        }
        return Math.max(dp[size-2], dp2[size-1]);
    }
}
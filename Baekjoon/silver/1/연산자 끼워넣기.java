import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 18: 21
public class Main {
    static int N;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int[] numbers;
    static int[] opers = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            opers[i] = Integer.parseInt(st.nextToken());
        }
        dfs(numbers[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int number, int index) {
        if (index == N) {
            min = Math.min(number, min);
            max = Math.max(number, max);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (opers[i] > 0){
                opers[i]--;
                switch(i){
                    case 0: dfs(number + numbers[index], index + 1); break;
                    case 1: dfs(number - numbers[index], index + 1); break;
                    case 2: dfs(number * numbers[index], index + 1); break;
                    case 3: dfs(number / numbers[index], index + 1); break;
                }
                opers[i]++;
            }
        }

    }
}
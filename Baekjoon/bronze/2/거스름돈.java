import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(solve(1000-input));
        br.close();
    }

    static int solve(int input) {
        int result = 0;
        int[] arr = {500, 100, 50, 10, 5, 1};
        for (int value : arr) {
            if(input == 0) return result;
            result += input / value;
            input %= value;
        }
        return result;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] number = new int[27];
        for(int i = 0 ; i < n ; i ++){
            String input = br.readLine();
            for(int j = 0 ; j <input.length(); j ++){
                int index = input.charAt(j) - 'A';
                number[index] += Math.pow(10, input.length() - j - 1);
            }
        }
        Arrays.sort(number, Collections.reverseOrder());
        int result = 0;
        for(int i = 0; i < 10; i++){
            result += number[i] * (10 - i - 1);
        }
        System.out.println(Arrays.toString(number));
        System.out.println(result);
    }
}
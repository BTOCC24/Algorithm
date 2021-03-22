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
        Integer[] number = new Integer[27];
        for(int i = 0 ; i < 27; i ++){
            number[i] = 0;
        }
        for(int i = 0 ; i < n ; i ++){
            String input = br.readLine();
            for(int j = 0 ; j <input.length(); j ++){
                int index = input.charAt(j) - 'A';
                number[index] += (int)Math.pow(10, input.length() - j - 1);
            }
        }
        Arrays.sort(number, (a, b) -> b - a);
        int result = 0;
        for(int i = 0; i < 10; i++){
            result += number[i] * (10 - i - 1);
        }
        System.out.println(result);
    }
}
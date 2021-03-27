import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            for(int i = 0 ; i <n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int[] namu = new int[n];
            for(int i = 0; i < n; i++){
                if (i % 2 == 0)
                    namu[i / 2] = arr[i];
                else{
                    namu[n-1-i/2] = arr[i];
                }
            }

            int max = 0;
            for(int i = 0; i < n - 1; i++){
                max = Math.max(Math.abs(namu[i + 1] - namu[i]), max);
            }
            max = Math.max(Math.abs(namu[n - 1] - namu[0]), max);

            sb.append(max + "\n");
        }
        System.out.print(sb.toString());
    }
}
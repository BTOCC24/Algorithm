import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int count = 0;
    public static int[] arr;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.println(count);
    }

    public static void nQueen(int depth) {
        if (depth == N){
            count++;
            return;
        }

        for(int i = 0; i < N; i++){
            arr[depth] = i;
            if (possible(depth)){
                nQueen(depth + 1);
            }
        }

    }

    public static boolean possible(int depth) {
        for(int i = 0; i < depth; i++){
            if (arr[i] == arr[depth]) return false;
            else if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i]))  return false;
        }
        return true;
    }
}
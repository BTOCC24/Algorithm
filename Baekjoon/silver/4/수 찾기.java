import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= m; i++){
            int p = bsearch(arr, Integer.parseInt(st.nextToken()), 0, arr.length -1);
            sb.append(p + "\n");
        }
        System.out.println(sb.toString());
    }

    private static int bsearch(int[] arr, int target, int start, int end) {
        if (start > end) return 0;
        int mid = (start + end) / 2;

        if (target < arr[mid]) return bsearch(arr, target, start, mid - 1);
        else if (target > arr[mid]) return bsearch(arr, target, mid + 1, end);
        else return 1;
    }
}
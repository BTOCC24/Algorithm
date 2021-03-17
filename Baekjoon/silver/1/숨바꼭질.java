import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (n > k){
            System.out.println(n - k);
            System.exit(0);
        }

        int min = Math.abs(n - k);
        boolean[] visited = new boolean[2 * k + 1];

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{n, 0});
        visited[n] = true;

        while(!q.isEmpty()){
            int[] x = q.poll();
            if (x[1] < min){ // min 보다 작은거만 Push
                if (x[0] < k){ // target보다 작을 경우
                    if (!visited[x[0] + 1]){
                        q.offer(new int[]{x[0] + 1, x[1] + 1});
                        visited[x[0] + 1] = true;
                    }
                    if (!visited[x[0] * 2]){
                        q.offer(new int[]{x[0] * 2, x[1] + 1});
                        visited[x[0] * 2] = true;
                    }
                    if (x[0] > 0 && !visited[x[0] - 1]){
                        q.offer(new int[]{x[0] - 1, x[1] + 1});
                        visited[x[0] - 1] = true;
                    }
                }else if (x[0] > k){
                    if (!visited[x[0] - 1]){
                        q.offer(new int[]{x[0] - 1, x[1] + 1});
                        visited[x[0] - 1] = true;
                    }
                }else{
                    min = x[1];
                }
            }
        }
        System.out.print(min);
    }
}
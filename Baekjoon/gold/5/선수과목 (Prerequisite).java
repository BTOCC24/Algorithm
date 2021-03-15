// 15:00

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] degree = new int[n + 1];
        int[] result = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();

        ArrayList<ArrayList<Integer>> subject = new ArrayList<>();
        subject.add(new ArrayList<>());
        for(int i = 0; i < n; i++){
            subject.add(new ArrayList<>());
        }

        Arrays.fill(result, 1);
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int pre = Integer.parseInt(st.nextToken());
            int after = Integer.parseInt(st.nextToken());
            subject.get(pre).add(after);
            degree[after]++;
        }

        for(int i = 0; i < n; i++){
            if (degree[i] == 0) {
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int node = q.poll();
            for(int x : subject.get(node)){
                degree[x]--;
                result[x] = result[node] + 1;
                if (degree[x] == 0){
                    q.offer(x);
                }
            }
        }

        for(int i = 1; i<= n; i++){
            System.out.print(result[i] + " ");
        }
    }
}
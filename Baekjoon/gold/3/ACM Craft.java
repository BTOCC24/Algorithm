// 13:00

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br;
    static int T, N, K, W;
    static int[] D, degree, dp;
    static ArrayList<ArrayList<Integer>> list;
    static ArrayList<ArrayList<Integer>> rlist;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            init();
            calculate();
            sb.append(dp[W] + "\n");
        }
        System.out.print(sb.toString());
    }

    private static void calculate() {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        for(int i = 1; i <= N; i ++) {
            if (degree[i] == 0) {
                q.offer(i);
                dp[i] = D[i];
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            result.offer(node);

            for(int x : list.get(node)){
                degree[x]--;
                if (degree[x] == 0) {
                    int max = Integer.MIN_VALUE;
                    for(int y : rlist.get(x)){
                        max = Math.max(max, dp[y]);
                    }
                    dp[x] = max + D[x];
                    q.offer(x);
                }
            }
        }
    }

    private static void init() throws IOException {
        list = new ArrayList<>();
        rlist = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        degree = new int[N + 1];
        D = new int[N + 1];
        dp = new int[N + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        list.add(new ArrayList<>()); // index 0
        rlist.add(new ArrayList<>()); // index 0

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            D[i] = Integer.parseInt(st.nextToken());
            list.add(new ArrayList<>());
            rlist.add(new ArrayList<>());
        }

        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            rlist.get(y).add(x);
            degree[y]++;
        }

        W = Integer.parseInt(br.readLine());
    }
}
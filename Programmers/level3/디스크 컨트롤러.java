import java.util.*;

public class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.print(sol.solution(new int[][]{new int[]{0, 5}, new int[]{2, 10}, new int[]{1000000, 2}}));
    }
}

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int size = jobs.length;
        Arrays.sort(jobs, (o1, o2) -> {
            if (o1[0] != o2[0]){
                return o1[0] - o2[0];
            }else{
                return o1[1] - o2[1];
            }
        });

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        int count = 0;
        int t = jobs[0][0];
        while(!pq.isEmpty() || count < size){
            for(int i = count; i < size; i++){
                if (t >= jobs[i][0]){
                    pq.add(jobs[i]);
                    count++;
                }
            }

            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                t += job[1];
                answer += (t - job[0]);
            }else if(count < size){
                t = jobs[count][0];
            }
        }

        return answer / size;
    }
}
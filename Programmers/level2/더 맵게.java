import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.print(sol.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int s : scoville){
            pq.add(s);
        }

        while(pq.peek() < K){
            //System.out.println(pq);
            if (pq.size() == 1){
                answer = -1;
                break;
            }
            pq.offer(pq.poll() + pq.poll() * 2);
            answer++;
        }

        return answer;
    }
}
import java.util.List;
import java.util.LinkedList;
class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];

        int[][] sol = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        for (int num = 0; num < answers.length; num++){
            int answer = answers[num];
            for (int p = 0; p < score.length; p++){
                if (answer == sol[p][num % sol[p].length]){
                    score[p]++;
                }
            }
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new LinkedList<Integer>();
        for (int p = 0; p <score.length; p++){
            if (score[p] == maxScore){
                list.add(p + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
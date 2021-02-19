import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int len = numbers.length;
        Set<Integer> set = new TreeSet<>();
        for (int i=0; i<len - 1; i++){
            for (int j = i + 1; j<len; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
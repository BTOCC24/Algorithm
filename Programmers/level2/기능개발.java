import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int size = progresses.length;
        int standard = 0;
        int count = 1;
        int time[] = new int[size];
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < size; index++){
            time[index] = (int)Math.ceil((100 - progresses[index]) / (float)speeds[index]);
            if (standard < time[index]){
                standard = time[index];
                list.add(count);
                count = 1;
            }else{
                count++;
            }
        }
        list.add(count);
        return list.subList(1, list.size()).stream().mapToInt(Integer::intValue).toArray();

    }
}
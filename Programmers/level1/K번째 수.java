import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = solve(array, commands[i]);
        }
        return answer;
    }

    public static int solve(int[] array, int[] command){
        int size = command[1] - command[0] + 1;
        int index = 0;
        int[] arr = new int[size];

        //System.out.println(arr.length);
        for(int i = command[0]; i <= command[1]; i++){
            arr[index++] = array[i - 1];
        }

        Arrays.sort(arr);
        return arr[command[2] - 1];
    }
}
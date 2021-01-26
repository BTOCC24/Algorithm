class Solution {
    public int[] solution(long n) {
        int[] answer = new int[11];
        int index = 0;
        while(n > 0){
            answer[index++] = (int)(n % 10);
            n = n / 10;
        }
        int[] temp = new int[index];
        for (int i=0; i<temp.length; i++){
            temp[i] = answer[i];
        }
        answer = temp;
        return answer;
    }
}
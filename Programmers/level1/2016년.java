class Solution {
    public String solution(int a, int b) {
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] d = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int diff = 0;
        for (int i=0;i < a - 1;i++){
            diff += day[i];
        }
        diff += b + 4;
        String answer = d[diff % 7];
        return answer;
    }
}
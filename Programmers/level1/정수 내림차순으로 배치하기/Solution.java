class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "" + n;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 0;
        for(int i = 0; i<str.length(); i++){
            arr[str.charAt(i) - '0']++;
        }
        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < arr[i]; j++){
                answer += i;
                answer *= 10;
            }
        }
        return answer / 10;
    }
}
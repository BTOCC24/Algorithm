class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n+2];
        int answer = n;

        for(int l : lost)
            people[l]--;
        for(int r : reserve)
            people[r]++;

        for(int p = 1; p <= n; p++){
            if (people[p] == -1){
                if (people[p-1] == 1){
                    people[p-1]--;
                    people[p]++;
                }else if (people[p+1] == 1){
                    people[p+1]--;
                    people[p]++;
                }else{
                    answer--;
                }
            }
        }

        return answer;
    }
}
